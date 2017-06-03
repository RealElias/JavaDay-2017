package by.bkug.jd.kodewars

import java.util.stream.Collectors

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 *
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
fun accum(s: String): String {
    var counter : Int = 0

    return s.split("").stream()
            .filter(String::isNotBlank)
            .map(String::toLowerCase)
            .map { c -> c.toUpperCase() + 1.rangeTo(counter++).map { c }.stream().collect(Collectors.joining())  }
            .collect(Collectors.joining("-"))
}