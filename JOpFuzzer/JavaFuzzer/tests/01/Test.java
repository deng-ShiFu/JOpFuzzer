// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:03:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1078166500033723592L;
    public static int iFld=-33680;
    public float fFld=115.509F;
    public volatile double dFld=-2.78967;
    public static byte byFld=55;
    public short sFld=17421;
    public long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];
    public double dArrFld[]=new double[N];
    public static boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, -75.486F);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {

        int i1=106, i2=22293, i3=-2, i4=43100, i5=-81, i6=-7, i7=-199, iArr[]=new int[N];
        double d1=0.122597;
        byte by1=-79;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 43.960F);
        FuzzerUtils.init(iArr, 62128);

        Test.iFld -= Test.iFld;
        for (i1 = 7; i1 < 184; i1++) {
            Test.iFld = (int)d1;
            for (i3 = 1; i3 < 9; i3++) {
                fArr[i1 + 1] -= by1;
                i2 = (int)Test.instanceCount;
                Test.instanceCount = Test.instanceCount;
                switch ((((i2 >>> 1) % 3) * 5) + 22) {
                case 37:
                    Test.instanceCount |= 12;
                case 33:
                    for (i5 = i1; 2 > i5; ++i5) {
                        iArr[i1 - 1] = i3;
                    }
                    i7 = 1;
                    while (++i7 < 2) {
                        i6 += (((i7 * i4) + i1) - Test.instanceCount);
                        by1 *= by1;
                        i6 *= i5;
                    }
                    break;
                case 24:
                    d1 = 17;
                }
            }
        }
        long meth_res = i1 + i2 + Double.doubleToLongBits(d1) + i3 + i4 + by1 + i5 + i6 + i7 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(float f) {

        byte by=90;

        by >>= (byte)(-(lMeth() << Test.iFld));
        long meth_res = Float.floatToIntBits(f) + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vSmallMeth() {

        float f1=-2.957F;

        Test.instanceCount = (iMeth(f1) * -1420471597L);
        vSmallMeth_check_sum += Float.floatToIntBits(f1);
    }

    public void mainTest(String[] strArr1) {

        double d=50.53214;
        int i=6, i8=-54, i9=17810, i10=-14, i11=-47016, i12=-240, i13=9;
        long l=-200L;
        boolean b=false;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)22573);

        Test.instanceCount += (Test.iFld = ((5 + (Test.iFld * -12)) + (Test.iFld % (Test.iFld | 1))));
        for (d = 3; d < 168; ++d) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth();
        }
        i8 = 1;
        while (++i8 < 154) {
            i += Test.iFld;
            Test.instanceCount += (((i8 * i8) + fFld) - Test.instanceCount);
            Test.iFld -= (int)d;
            if (b) {
                for (i9 = 2; i9 < 163; i9++) {
                    dFld -= i;
                    lArrFld[i8] -= (long)1.263F;
                    for (l = 1; l < 2; ++l) {
                        fFld = i11;
                        Test.instanceCount = i11;
                        Test.instanceCount += i;
                        fFld = 14;
                        Test.fArrFld = Test.fArrFld;
                        i11 -= (int)l;
                        switch ((((i10 >>> 1) % 2) * 5) + 60) {
                        case 64:
                        case 62:
                            sArr[i9] ^= (short)249;
                            b = b;
                            break;
                        }
                        i13 += (int)(l * l);
                        Test.instanceCount = i11;
                        switch ((i9 % 7) + 111) {
                        case 111:
                            switch (((i9 % 8) * 5) + 125) {
                            case 156:
                                Test.instanceCount = i8;
                                fFld = Test.byFld;
                                break;
                            case 128:
                                i += (-1713 + (l * l));
                                i11 >>>= i8;
                                Test.instanceCount = Test.instanceCount;
                                break;
                            case 135:
                                Test.iFld *= (int)Test.instanceCount;
                                break;
                            case 153:
                                dArrFld[(int)(l - 1)] %= 24449;
                                break;
                            case 131:
                                i13 = i12;
                                break;
                            case 147:
                                dArrFld[(int)(l + 1)] /= (i8 | 1);
                                break;
                            case 146:
                                Test.instanceCount >>= i;
                                break;
                            case 136:
                                i10 |= (int)Test.instanceCount;
                                break;
                            }
                            break;
                        case 112:
                            i13 -= 30252;
                        case 113:
                            i11 = (int)l;
                            break;
                        case 114:
                            i10 += (int)l;
                            break;
                        case 115:
                            Test.bArrFld[i8 + 1][(int)(l - 1)] = b;
                        case 116:
                            sFld += (short)(((l * i11) + i9) - i9);
                        case 117:
                            Test.instanceCount >>>= i11;
                            break;
                        }
                    }
                }
            } else if (b) {
                i *= Test.byFld;
            } else {
                dFld *= i;
            }
        }

        FuzzerUtils.out.println("d i i8 = " + Double.doubleToLongBits(d) + "," + i + "," + i8);
        FuzzerUtils.out.println("i9 i10 l = " + i9 + "," + i10 + "," + l);
        FuzzerUtils.out.println("i11 i12 b = " + i11 + "," + i12 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i13 sArr = " + i13 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld fFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("dFld Test.byFld sFld = " + Double.doubleToLongBits(dFld) + "," + Test.byFld + "," +
            sFld);
        FuzzerUtils.out.println("lArrFld Test.fArrFld dArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth iMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
