package com.qaacademy.module1.programming.class4.strategypattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Prepare form fields
        Map<FormFields, String> formFields = new HashMap<>();
        formFields.put(FormFields.FIRST_NAME, "John");
        formFields.put(FormFields.LAST_NAME, "Vasquez");
        formFields.put(FormFields.EMAIL, "example@gamil.com");
        formFields.put(FormFields.PHONE, "+59169875648");

        // Fill form.
        BrowserForm browserForm = new BrowserForm();
        System.out.println("Fill form using Browser example 1:");
        browserForm.fillForm(formFields);

        // Prepare form fields

        formFields.clear();
        formFields.put(FormFields.FIRST_NAME, "John");
        formFields.put(FormFields.LAST_NAME, "Vasquez");
        formFields.put(FormFields.EMAIL, "example@gamil.com");

        // Fill form.
        System.out.println("Fill form using Browser example 2:");
        browserForm.fillForm(formFields);

        formFields.clear();
        formFields.put(FormFields.FIRST_NAME, "John");

        // Fill form.
        System.out.println("Fill form using Browser example 3:");
        browserForm.fillForm(formFields);
        formFields.clear();
        formFields.put(FormFields.FIRST_NAME, "John");
        formFields.put(FormFields.BIRTHDATE, "5/12/1996");

        // Fill form.
        System.out.println("Fill form using Browser example 4:");
        browserForm.fillForm(formFields);
    }
}
