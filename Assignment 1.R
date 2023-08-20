setwd("C:/Users/Pman/Desktop/REGRESSION MODELS")

# Read data from file and create a data.frame
skincells <- read.csv("skincells.csv")
skincells

by(skincells$logcells, skincells$time, mean)

by(skincells$logcells, skincells$day, mean)

# Create plot
library(ggplot2)
p <- ggplot(skincells, aes(x = time, y = logcells, color = time)) + 
  geom_point(size = 3) + 
  scale_color_gradient(low = "blue", high = "orange") +
  xlab("Time") +
  ylab("Log cells") +
  ggtitle("Skin cells over time")
p
# Save plot as .jpeg file
jpeg("C:/Users/Pman/Desktop/REGRESSION MODELS/logcells_time.jpeg", 
     quality = 100, width = 800, height = 600)
print(p)

dev.off()

# Create plot
q <- ggplot(skincells, aes(x = day, y = logcells)) + 
  geom_point(size = 3, color = "blue") +
  xlab("Day") +
  ylab("Log cells") +
  ggtitle("Skin cells over time") +
  theme_bw()

# Save plot as .jpeg file
jpeg("C:/Users/Pman/Desktop/REGRESSION MODELS/logcells_day.jpeg", 
     quality = 100, width = 800, height = 600)
print(q)

dev.off()

# Regression model 1: 'main effects' non interaction
fit1 <- lm(logcells~factor(time) + factor(day), data = skincells)
summary(fit1)
drop1(fit1, test = 'F')
library(emmeans)
emm_options(shape = c(15, 16, 17, 18, 19, 20, 21, 22))
emmip(fit1, factor(time) ~ factor(day))
emmeans(fit1,~factor(time)+ factor(day))
emmeans(fit1,pairwise~factor(time)+ factor(day), adjust = 'none')

# Create the emmip plot and save it as a jpeg image
my_plot <- emmip(fit1, factor(time) ~ factor(day))
jpeg("C:/Users/Pman/Desktop/REGRESSION MODELS/fit1.jpg", 
     width = 297, height = 210, units = "mm", res = 600)
print(my_plot)
dev.off()

# Regression model 2: Interaction (full factorial model)
fit2 <- lm(logcells~factor(time)*factor(day), data = skincells)
summary(fit2)
drop1(fit2, test = 'F')
emmip(fit2, factor(time)~factor(day))
emmeans(fit2,~factor(time)+ factor(day))
emmeans(fit2,~factor(time)*factor(day), adjust = 'none')

# Create the emmip plot and save it as a jpeg image
my_plot2 <- emmip(fit2, factor(time) ~ factor(day))
jpeg("C:/Users/Pman/Desktop/REGRESSION MODELS/fit2.jpg", 
     width = 297, height = 210, units = "mm", res = 600)
print(my_plot2)
dev.off()
