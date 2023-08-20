package com.java.membership;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class MembershipBean {
    private List<Membership> memberships;

    public MembershipBean() {
        memberships = new ArrayList<>();
        
        List<String> benefits3Months = new ArrayList<>();
        benefits3Months.add("Explore our website and discover the perfect fitness journey for you.");
        benefits3Months.add("Unlock access to a world of possibilities with three transformative months.");
        benefits3Months.add("Enjoy one monthly one-on-one sessions with a personal trainer who tailors a program just for you.");
        
        List<String> benefits6Months = new ArrayList<>();
        benefits6Months.add("Take your fitness to the next level with our dynamic 6 Month Membership.");
        benefits6Months.add("Receive two personalized sessions per month to accelerate your progress.");
        benefits6Months.add("Work closely with a dedicated personal trainer to reach new fitness heights.");

        List<String> benefits12Months = new ArrayList<>();
        benefits12Months.add("Embark on a year-long fitness adventure with our comprehensive 12 Month Membership.");
        benefits12Months.add("Benefit from four individual sessions per month, led by a skilled personal trainer.");
        benefits12Months.add("Receive four personalized sessions per month to accelerate your progress.");
        
        memberships.add(new Membership("3 Month Membership", 3, 30.0, benefits3Months));
        memberships.add(new Membership("6 Month Membership", 6, 50.0, benefits6Months));
        memberships.add(new Membership("12 Month Membership", 12, 100.0, benefits12Months));
    }

    public List<Membership> getMemberships() {
        return memberships;
    }
}
