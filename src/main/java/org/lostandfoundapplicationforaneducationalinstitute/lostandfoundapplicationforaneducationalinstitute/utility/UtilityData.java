package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility;

import java.time.LocalDate;
import java.util.UUID;

public class UtilityData {

    public static LocalDate generateCurrentDate() {
        return LocalDate.now();
    }

    public static String generateItemId() {
        return "I -"+ UUID.randomUUID();
    }
}
