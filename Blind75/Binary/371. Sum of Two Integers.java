public int getSum(int a, int b) {
    while (b != 0) {
        int tmp = (a & b) << 1;
        a = a ^ b;
        b = (a & b) << 1;
    }
    return a;
}
