package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
    //仕様１：指定日の曜日の算定
    @GetMapping("/dayofweek/{strDate}")
    public DayOfWeek dispDayOfWeek(@PathVariable String strDate) {
       String year = strDate.substring(0, 4);
       String month = strDate.substring(4, 6);
       String day = strDate.substring(6, 8);
       var  date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
       return date.getDayOfWeek();
    }

    //仕様２：四則演算
    @GetMapping("/plus/{val1}/{val2}")   //足し算
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
        }
    @GetMapping("/minus/{val1}/{val2}")  //引き算
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
        }
    @GetMapping("/times/{val1}/{val2}")  //掛け算
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return  res;
        }
    @GetMapping("/divide/{val1}/{val2}")  //割り算
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 % val2;
        return  res;
        }

}
