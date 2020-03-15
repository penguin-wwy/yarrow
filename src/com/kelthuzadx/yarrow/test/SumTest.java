package com.kelthuzadx.yarrow.test;

public class SumTest {
//            0 : #0[0,3] => [#9[4,7]]
//            1 : #0[0,3] => [#9[4,7]]
//            2 : #0[0,3] => [#9[4,7]]
//            3 : #0[0,3] => [#9[4,7]]
//            4 : #9[4,7] => [#1[89,90], #2[10,19]]
//            5 : #9[4,7] => [#1[89,90], #2[10,19]]
//            6 : #9[4,7] => [#1[89,90], #2[10,19]]
//            7 : #9[4,7] => [#1[89,90], #2[10,19]]
//            8 : []
//            9 : []
//            10 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            11 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            12 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            13 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            14 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            15 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            16 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            17 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            18 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            19 : #2[10,19] => [#3[77,82], #4[48,51], #5[54,59], #6[62,65], #7[68,74]]
//            20 : []
//            21 : []
//            22 : []
//            23 : []
//            24 : []
//            25 : []
//            26 : []
//            27 : []
//            28 : []
//            29 : []
//            30 : []
//            31 : []
//            32 : []
//            33 : []
//            34 : []
//            35 : []
//            36 : []
//            37 : []
//            38 : []
//            39 : []
//            40 : []
//            41 : []
//            42 : []
//            43 : []
//            44 : []
//            45 : []
//            46 : []
//            47 : []
//            48 : #4[48,51] => [#8[83,86]]
//            49 : []
//            50 : []
//            51 : #4[48,51] => [#8[83,86]]
//            52 : []
//            53 : []
//            54 : #5[54,59] => [#8[83,86]]
//            55 : #5[54,59] => [#8[83,86]]
//            56 : []
//            57 : #5[54,59] => [#8[83,86]]
//            58 : #5[54,59] => [#8[83,86]]
//            59 : #5[54,59] => [#8[83,86]]
//            60 : []
//            61 : []
//            62 : #6[62,65] => [#8[83,86]]
//            63 : []
//            64 : []
//            65 : #6[62,65] => [#8[83,86]]
//            66 : []
//            67 : []
//            68 : #7[68,74] => [#8[83,86]]
//            69 : #7[68,74] => [#8[83,86]]
//            70 : []
//            71 : []
//            72 : #7[68,74] => [#8[83,86]]
//            73 : #7[68,74] => [#8[83,86]]
//            74 : #7[68,74] => [#8[83,86]]
//            75 : []
//            76 : []
//            77 : #3[77,82] => [#8[83,86]]
//            78 : #3[77,82] => [#8[83,86]]
//            79 : []
//            80 : []
//            81 : #3[77,82] => [#8[83,86]]
//            82 : #3[77,82] => [#8[83,86]]
//            83 : #8[83,86] => [#9[4,7]]
//            84 : []
//            85 : []
//            86 : #8[83,86] => [#9[4,7]]
//            87 : []
//            88 : []
//            89 : #1[89,90] => []
//            90 : #1[89,90] => []
    public static int sum2(int base) {
        int r = base;
        for (int i = 0; i < 10; i++) {
            r += i * 1 / 1;
            switch (r) {
                case 3:
                    r += 34;
                    break;
                case 4:
                    r /= 23;
                    break;
                case 5:
                    r -= 32;
                    break;
                case 6:
                    r %= 2353;
                    break;
                default:
                    r *= 223;
                    break;
            }
        }
        return r;
    }

    //            0 : #0[0,3] => [#8[4,7]]
//            1 : #0[0,3] => [#8[4,7]]
//            2 : #0[0,3] => [#8[4,7]]
//            3 : #0[0,3] => [#8[4,7]]
//            4 : #8[4,7] => [#1[76,77], #2[10,19]]
//            5 : #8[4,7] => [#1[76,77], #2[10,19]]
//            6 : #8[4,7] => [#1[76,77], #2[10,19]]
//            7 : #8[4,7] => [#1[76,77], #2[10,19]]
//            8 : []
//            9 : []
//            10 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            11 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            12 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            13 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            14 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            15 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            16 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            17 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            18 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            19 : #2[10,19] => [#3[67,67], #4[52,55], #5[58,61], #6[64,64]]
//            20 : []
//            21 : []
//            22 : []
//            23 : []
//            24 : []
//            25 : []
//            26 : []
//            27 : []
//            28 : []
//            29 : []
//            30 : []
//            31 : []
//            32 : []
//            33 : []
//            34 : []
//            35 : []
//            36 : []
//            37 : []
//            38 : []
//            39 : []
//            40 : []
//            41 : []
//            42 : []
//            43 : []
//            44 : []
//            45 : []
//            46 : []
//            47 : []
//            48 : []
//            49 : []
//            50 : []
//            51 : []
//            52 : #4[52,55] => [#7[70,73]]
//            53 : []
//            54 : []
//            55 : #4[52,55] => [#7[70,73]]
//            56 : []
//            57 : []
//            58 : #5[58,61] => [#7[70,73]]
//            59 : []
//            60 : []
//            61 : #5[58,61] => [#7[70,73]]
//            62 : []
//            63 : []
//            64 : #6[64,64] => [#3[67,67]]
//            65 : []
//            66 : []
//            67 : #3[67,67] => [#7[70,73]]
//            68 : []
//            69 : []
//            70 : #7[70,73] => [#8[4,7]]
//            71 : []
//            72 : []
//            73 : #7[70,73] => [#8[4,7]]
//            74 : []
//            75 : []
//            76 : #1[76,77] => []
//            77 : #1[76,77] => []
    public static int sum1(int base) {
        int r = base;
        for (int i = 0; i < 10; i++) {
            r += i * 1 / 1;
            switch (r) {
                case 13:
                    r += 124;
                    break;
                case 14:
                    r += 126;
                    break;
                case 19:
                    r += 1;
                default:
                    r += 1;
                    break;

            }
        }
        return r;
    }

    //        0 : #0[0,3] => [#3[4,7]]
//        1 : #0[0,3] => [#3[4,7]]
//        2 : #0[0,3] => [#3[4,7]]
//        3 : #0[0,3] => [#3[4,7]]
//        4 : #3[4,7] => [#1[24,25], #2[10,21]]
//        5 : #3[4,7] => [#1[24,25], #2[10,21]]
//        6 : #3[4,7] => [#1[24,25], #2[10,21]]
//        7 : #3[4,7] => [#1[24,25], #2[10,21]]
//        8 : []
//        9 : []
//        10 : #2[10,21] => [#3[4,7]]
//        11 : #2[10,21] => [#3[4,7]]
//        12 : #2[10,21] => [#3[4,7]]
//        13 : #2[10,21] => [#3[4,7]]
//        14 : #2[10,21] => [#3[4,7]]
//        15 : #2[10,21] => [#3[4,7]]
//        16 : #2[10,21] => [#3[4,7]]
//        17 : #2[10,21] => [#3[4,7]]
//        18 : #2[10,21] => [#3[4,7]]
//        19 : []
//        20 : []
//        21 : #2[10,21] => [#3[4,7]]
//        22 : []
//        23 : []
//        24 : #1[24,25] => []
//        25 : #1[24,25] => []
    public static int sum(int base) {
        int r = base;
        for (int i = 0; i < 10; i++) {
            r += i * 1 / 1;
        }
        return r;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 999998; i++) {
            sum += sum(1);
            sum += sum2(i);
        }
        System.out.println(sum);
    }
}
