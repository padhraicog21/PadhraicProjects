setwd("C:/Users/Pman/Desktop/REGRESSION MODELS")

churn <- read.csv("telecoms_churn.csv", header = T)

head(churn)

fit1 <- glm(churn~factor(gender)+internetservice+partner+monthlycharges
            +paymentmethod, family = binomial, data = churn)

summary(fit1)

drop1(fit1,test='LRT')

# Use R to calculate an estimate of the probability of churning for: 
# a male, living with his partner, monthly charges=70, internet service=fibre 
# optic, payment method= credit card. Use R to get a 95% confidence interval 
# for this estimate. Incorporate this CI into your report. 

new_data <- data.frame(gender = "Male",
                       partner = "Yes",
                       monthlycharges = 70,
                       internetservice = "Fiber optic",
                       paymentmethod = "Credit card (automatic)")

pred <- predict(fit1, newdata = new_data, se.fit = TRUE)
pred

exp(pred$fit)

lpci = exp(pred$fit - 1.96*pred$se.fit)
upci = exp(pred$fit + 1.96*pred$se.fit)

c(lpci,upci)
