// Generated by Java* Fuzzer Test_8252372 generator (1.0.001). Fri May 28 04:44:12 2021
public class Test_8252372 {

    public static final int N = 400;

    public static long instanceCount=1286043436L;
    public static int iFld=-11;
    public byte byFld=-57;
    public float fFld=-2.955F;
    public double dFld=71.84591;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test_8252372.iArrFld, 1);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vSmallMeth(long l, int i, int i1) {


        i = (++Test_8252372.iArrFld[(47329 >>> 1) % N]);
        vSmallMeth_check_sum += l + i + i1;
    }

    public static void vMeth1() {

        int i13=20098, i14=-24565, i15=-2922, i16=78, i17=95, i18=-3, i19=1;
        byte by2=105;
        float f1=0.978F;
        short s1=-21307;
        double d=11.7002;

        for (i13 = 9; i13 < 144; ++i13) {
            for (i15 = 1; 12 > i15; ++i15) {
                Test_8252372.iArrFld[(i16 >>> 1) % N] = Test_8252372.iFld;
                i16 = Test_8252372.iFld;
            }
            i14 += (int)(-10L + (i13 * i13));
            Test_8252372.iArrFld = Test_8252372.iArrFld;
            i16 += (((i13 * Test_8252372.instanceCount) + by2) - f1);
            for (i17 = 1; i17 < 12; ++i17) {
                i14 += (i17 + Test_8252372.iFld);
                i18 += i17;
            }
            s1 = (short)-240;
            i19 = 1;
            while (++i19 < 12) {
                f1 += s1;
            }
            i14 += (((i13 * i13) + Test_8252372.iFld) - Test_8252372.iFld);
            d += 244;
        }
        vMeth1_check_sum += i13 + i14 + i15 + i16 + by2 + Float.floatToIntBits(f1) + i17 + i18 + s1 + i19 +
            Double.doubleToLongBits(d);
    }

    public static int iMeth(int i7, int i8, byte by1) {

        float f=-1.635F;
        int i9=44, i10=125, i11=-3, i12=-85, i20=116, i21=-49556;
        boolean b=false;
        double d1=0.17966;

        f = Math.max(7, i7);
        for (i9 = 7; i9 < 224; ++i9) {
            i10 -= -1054;
            if (b) {
                for (i11 = i9; i11 < 7; ++i11) {
                    vMeth1();
                    for (i20 = 1; i20 < 1; i20++) {
                        by1 >>= (byte)34;
                        if (b) {
                            i12 += (((i20 * Test_8252372.instanceCount) + i10) - i10);
                        }
                        Test_8252372.instanceCount <<= i12;
                        d1 = i12;
                        i8 <<= i9;
                        i10 >>= (int)Test_8252372.instanceCount;
                        f = Test_8252372.iFld;
                    }
                }
            }
        }
        long meth_res = i7 + i8 + by1 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + i20 + i21 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(int i5, int i6) {

        int i22=0, i23=-63005, i24=61512, i25=-2, i27=7;
        boolean b1=false;
        double d2=-49.95513, dArr[]=new double[N];
        short s2=-29461;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -1L);
        FuzzerUtils.init(dArr, 1.115363);

        Test_8252372.iArrFld[(Test_8252372.iFld >>> 1) % N] *= (Math.abs(Test_8252372.iFld) + (Test_8252372.iArrFld[(Test_8252372.iFld >>> 1) % N] - i5));
        vSmallMeth((++i5) >> (++Test_8252372.iFld), (iMeth(i6, i6, byFld) + Test_8252372.iFld) ^ i6, i6);
        for (i22 = 5; i22 < 144; i22++) {
            i6 += i22;
        }
        for (i24 = 14; i24 < 264; i24++) {
            switch ((i24 % 10) + 35) {
            case 35:
                Test_8252372.iFld = i6;
                break;
            case 36:
                if (b1) break;
                i5 = i6;
                Test_8252372.iFld >>= 192;
                Test_8252372.iArrFld[i24 - 1] += (int)fFld;
                break;
            case 37:
                for (d2 = 1; d2 < 7; ++d2) {
                    if (b1) continue;
                    fFld = Test_8252372.instanceCount;
                    lArr1[(int)(d2)] = 49555;
                }
                break;
            case 38:
                i23 >>= i6;
            case 39:
                fFld *= i22;
                break;
            case 40:
                i25 -= i23;
                break;
            case 41:
            case 42:
                Test_8252372.instanceCount = i22;
            case 43:
                s2 -= (short)-152;
            case 44:
                dFld *= Test_8252372.instanceCount;
                break;
            }
        }
        vMeth_check_sum += i5 + i6 + i22 + i23 + i24 + i25 + (b1 ? 1 : 0) + Double.doubleToLongBits(d2) + i27 + s2 +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest_8252372(String[] strArr1) {

        int i2=90, i3=5, i4=0, i28=21664, i29=180, i30=-2, i31=49810, i32=-12250, i33=124;
        short s=-24818;
        byte by=-62;
        long lArr[]=new long[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(lArr, -100L);
        FuzzerUtils.init(dArr1, 44.7268);

        for (int smallinvoc=0; smallinvoc<598; smallinvoc++) vSmallMeth(-4382426878440214431L, (int)(Test_8252372.iFld *=
            (int)Math.max(lArr[(Test_8252372.iFld >>> 1) % N], Test_8252372.iFld + i2)), (int)((Test_8252372.instanceCount++) + (i2++)));
        for (i3 = 7; 372 > i3; ++i3) {
            Test_8252372.instanceCount -= (((--s) - i2) - (Test_8252372.iFld * (by - i3)));
        }
        i4 += (int)(((-i2) - (-(++lArr[(i2 >>> 1) % N]))) + Test_8252372.iFld);
        vMeth(i3, i2);
        Test_8252372.iArrFld[(i4 >>> 1) % N] |= -25;
        Test_8252372.instanceCount *= Test_8252372.iFld;
        i28 = 1;
        while (++i28 < 219) {
            Test_8252372.iFld = (int)Test_8252372.instanceCount;
            Test_8252372.instanceCount -= Test_8252372.instanceCount;
            i29 = 1;
            while (++i29 < 115) {
                i2 = -22032;
                for (i30 = i28; i30 < 1; i30++) {
                    Test_8252372.iArrFld[i30] = i29;
                    fFld *= Test_8252372.instanceCount;
                    i31 -= -18678;
                    Test_8252372.iFld = i3;
                    fFld += i30;
                }
                for (i32 = i28; i32 < 1; ++i32) {
                    i4 += i29;
                    i2 = (int)fFld;
                    by = (byte)fFld;
                    i33 = Test_8252372.iFld;
                    try {
                        i33 = (Test_8252372.iArrFld[i28] % i3);
                        i31 = (Test_8252372.iArrFld[i29 + 1] / Test_8252372.iFld);
                        Test_8252372.iFld = (i3 % i4);
                    } catch (ArithmeticException a_e) {}
                    i31 = i31;
                    i2 += i32;
                }
                Test_8252372.instanceCount += 2;
                Test_8252372.iFld = (int)fFld;
                bFld = bFld;
                dArr1[i29 + 1] *= Test_8252372.instanceCount;
            }
        }

        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("s by i28 = " + s + "," + by + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 lArr = " + i32 + "," + i33 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test_8252372.instanceCount Test_8252372.iFld byFld = " + Test_8252372.instanceCount + "," + Test_8252372.iFld + "," +
            byFld);
        FuzzerUtils.out.println("fFld dFld bFld = " + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld)
            + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test_8252372.iArrFld = " + FuzzerUtils.checkSum(Test_8252372.iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test_8252372 _instance = new Test_8252372();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest_8252372(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test_8252372 ->  Test_8252372
//DEBUG  main ->  main
//DEBUG  mainTest_8252372 ->  mainTest_8252372
//DEBUG  vSmallMeth ->  vSmallMeth mainTest_8252372 Test_8252372 vMeth
//DEBUG  vMeth ->  vMeth mainTest_8252372
//DEBUG  iMeth ->  iMeth vMeth mainTest_8252372
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest_8252372
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}