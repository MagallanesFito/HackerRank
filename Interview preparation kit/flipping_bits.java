static long flippingBits(long n) {
        long res = ~n & 0xffffffffl;
        return res;
    }
