package com.corejava.sorting;

/*public class Lead implements Comparable<Lead> {

    private String firstName;
    private String lastName;

    @Override
    public int compareTo(Lead lead) {
        if(this.firstName == lead.firstName)
            return 0;
        else
            return this.firstName.compareTo(lead.firstName);
    }
}*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
public class Lead {
    private String firstName;
    private String lastName;
}

class LeadSorting implements Comparator<Lead> {

    @Override
    public int compare(Lead o1, Lead o2) {
        if(o1.getLastName() == o2.getLastName())
            return 0;
        else
            return o1.getLastName().compareTo(o2.getLastName());
    }
}