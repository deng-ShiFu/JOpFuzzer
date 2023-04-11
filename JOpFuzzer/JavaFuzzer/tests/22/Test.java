// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:04:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-27338L;
    public static byte byFld=-38;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -33545);
        FuzzerUtils.init(Test.lArrFld, -39L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i5, int i6) {

        int i7=6, i8=-11, i9=94, i10=-25218, i11=-6, i12=12, i13=-13, i14=11, i15=36708, i16=-10096, i17=-8220,
            i18=146, iArr[]=new int[N];
        double d=0.84421;
        short s1=-24441;

        FuzzerUtils.init(iArr, -12);

        for (i7 = 19; i7 < 366; i7++) {
            for (i9 = 1; i9 < 5; ++i9) {
                d *= Test.instanceCount;
            }
            i10 *= (int)Test.instanceCount;
        }
        for (i11 = 7; i11 < 254; i11++) {
            try {
                i12 = (i6 % i12);
                i10 = (iArr[i11] % i5);
                i12 = (i5 / i5);
            } catch (ArithmeticException a_e) {}
        }
        for (i13 = 2; i13 < 390; ++i13) {
            for (i15 = 1; 4 > i15; i15 += 2) {
                for (i17 = 1; i17==4; ++i17) {
                    if (true) break;
                }
                i5 += i9;
                Test.instanceCount -= 8;
            }
            s1 = (short)i17;
            Test.instanceCount += (i13 * i13);
        }
        Test.byFld *= (byte)i6;
        long meth_res = i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + i15 + i16 +
            i17 + i18 + s1 + FuzzerUtils.checkSum(iArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i2, long l1, float f1) {

        int i3=46455, i4=-6, i20=63191, i21=4, i22=34548, i23=35;
        short s=-30704;
        double d1=-106.62901;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 0.218F);

        for (i3 = 12; 227 > i3; ++i3) {
            s += (short)(((i3 * i4) + i2) - i3);
            Test.byFld = (byte)(++l1);
            s += (short)(((i3 * l1) + i3) - f1);
            iMeth2(i4, i2);
            switch ((i3 % 9) + 36) {
            case 36:
                for (i20 = 7; i20 > i3; i20--) {
                    i21 *= 4;
                    i2 *= 5;
                    Test.iArrFld[i3 + 1] -= i20;
                    for (i22 = 1; 1 > i22; i22++) {
                        switch (((i22 % 5) * 5) + 68) {
                        case 84:
                            Test.iArrFld[i22] *= i22;
                            d1 = l1;
                            f1 *= i3;
                        case 82:
                            i23 += (int)Test.instanceCount;
                            break;
                        case 70:
                            d1 *= -9209;
                            break;
                        case 91:
                        case 88:
                            i23 = i21;
                            break;
                        default:
                            fArr[i22 - 1] = fArr[i3 - 1];
                        }
                    }
                }
                break;
            case 37:
                i4 = 39;
                break;
            case 38:
            case 39:
                i23 = i20;
                break;
            case 40:
                Test.instanceCount += (i3 ^ (long)f1);
                break;
            case 41:
                i21 = i21;
                break;
            case 42:
                l1 = l1;
            case 43:
                Test.instanceCount >>>= i2;
                break;
            case 44:
                i21 -= (int)Test.instanceCount;
                break;
            }
        }
        long meth_res = i2 + l1 + Float.floatToIntBits(f1) + i3 + i4 + s + i20 + i21 + i22 + i23 +
            Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, int i1, long l) {

        float f2=1.645F, f3=1.1019F;
        int i24=-143, i25=111, i27=13, i28=180;
        boolean b=true;
        short s2=23907;
        double d2=-73.51078, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.73414);

        i <<= -176;
        i = (int)(iMeth1(i1, Test.instanceCount, f2) + Test.instanceCount);
        for (i24 = 1; 326 > i24; ++i24) {
            i += (int)44839L;
            if (b) {
                dArr[i24] -= 14;
                i25 = i25;
                if (b) break;
            } else {
                Test.lArrFld[i24] <<= -42;
                s2 ^= (short)i1;
                d2 += Test.instanceCount;
            }
            i1 = i;
        }
        for (i27 = 7; 235 > i27; ++i27) {
            f2 += (i27 - l);
            i += (((i27 * f3) + i28) - i28);
        }
        long meth_res = i + i1 + l + Float.floatToIntBits(f2) + i24 + i25 + (b ? 1 : 0) + s2 +
            Double.doubleToLongBits(d2) + i27 + i28 + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i29=-9, i30=48869, i31=7, i32=6, i33=152, i34=68, i35=13, i36=80, i37=125, i38=3;
        float f4=0.386F, f5=0.973F;
        boolean b1=true;

        try {
            Test.instanceCount *= (iMeth(i29, i29, Test.instanceCount) - i30);
        }
        catch (NegativeArraySizeException exc1) {
            for (i31 = 15; 279 > i31; i31++) {
                Test.iArrFld = FuzzerUtils.int1array(N, (int)182);
                for (f4 = 3; f4 < 95; ++f4) {
                    i34 = 2;
                    while ((i34 -= 3) > 0) {
                        short s3=5512;
                        f5 -= i31;
                        i30 |= s3;
                        f5 *= f5;
                    }
                    for (i35 = 1; i35 < 2; i35++) {
                        Test.instanceCount = Test.instanceCount;
                        i36 += (((i35 * f5) + f4) - i35);
                        Test.instanceCount *= i31;
                        i29 -= i30;
                        Test.instanceCount *= Test.byFld;
                        b1 = b1;
                        Test.iArrFld[i31 + 1] = i29;
                        i32 = (int)Test.instanceCount;
                        i33 *= -23961;
                        Test.instanceCount <<= Test.byFld;
                    }
                    for (i37 = 1; i37 < 2; ++i37) {
                        Test.byFld = (byte)10;
                        i29 = i37;
                        Test.instanceCount = i31;
                        i30 += i31;
                        if (b1) {
                            Test.byFld = (byte)-2;
                            i38 *= i32;
                            f5 *= i31;
                        } else if (b1) {
                            i38 += (int)(118L + (i37 * i37));
                        } else if (b1) {
                            try {
                                i29 = (1782256295 / Test.iArrFld[i37 - 1]);
                                i36 = (Test.iArrFld[i31] / i38);
                                i32 = (Test.iArrFld[i37 - 1] % -253);
                            } catch (ArithmeticException a_e) {}
                        } else {
                            i30 *= i36;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 f4 i33 = " + i32 + "," + Float.floatToIntBits(f4) + "," + i33);
        FuzzerUtils.out.println("i34 f5 i35 = " + i34 + "," + Float.floatToIntBits(f5) + "," + i35);
        FuzzerUtils.out.println("i36 b1 i37 = " + i36 + "," + (b1 ? 1 : 0) + "," + i37);
        FuzzerUtils.out.println("i38 = " + i38);

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iArrFld = " + Test.instanceCount + "," + Test.byFld
            + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
