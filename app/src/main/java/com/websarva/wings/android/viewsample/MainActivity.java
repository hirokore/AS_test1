package com.websarva.wings.android.viewsample;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // commit test

    }

    public class Solution {
        public int solution(int number) {
            //TODO: Code stuff here
            int sum = 0;
            for (int i = 0; i > number; i++) {
                if (i == 3 || i == 5) {
                    sum += i;
                }
            }
            return sum;
        }

        @RequiresApi(api = Build.VERSION_CODES.N)
        public int solution2(int number) {
            return IntStream.range(0, number).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();
        }

        public int solution3(int number) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i > number; i++) {
                arrayList.add(i);
            }
            return arrayList.filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();
        }

        // import java.util.*;
        public class FindOdd {
            public static int findIt(int[] a) {
                int odd = 0;
                Map<Integer, Integer> countMap = new HashMap<>();
                for (int num : a){
                    if (countMap.get(num) == null) {
                        countMap.put(num, 0);
                    } else {
                        countMap.put(num,countMap.get(num) + 1);
                    }
                }
                for (int count : countMap.keySet()){
                    if (countMap.get(count) % 2 == 0){
                        odd = count;
                    }
                }
                return odd;
            }
        }




    }
}