package com.qa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * Data annotation will include - @getter, @setter, @RequiredArgsConstructor, @EqualsAndHashCode, @ToString by default
 * No need to add them separately
 */

@Data
@AllArgsConstructor
public class StudentInfo {

    private String studentName;
    private String rollNo;
    private String classNo;
    private String division;
    private String classTeacherName;

}
