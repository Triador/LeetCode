package contest.r91;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollars = 0, tenDollars = 0;
        for (int bill: bills) {
            switch (bill) {
                case 5:
                    fiveDollars++;
                    break;
                case 10:
                    if (fiveDollars > 0) {
                        fiveDollars--;
                        tenDollars++;
                    } else return false;
                    break;
                case 20:
                    if (tenDollars > 0 && fiveDollars > 0) {
                        tenDollars--;
                        fiveDollars--;
                    } else if (fiveDollars > 2) {
                        fiveDollars -= 3;
                    } else return false;
            }
        }
        return true;
    }
}
