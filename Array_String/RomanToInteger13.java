class RomanToInteger13 {
    public int romanToInt(String s) {
        int sum = 0;
        char ch [] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'I':
                    if ((i + 1 != ch.length) && ch[i] == 'I' && ch[i+1] == 'V') {
                        i++;
                        sum += 4;
                    } else if ((i + 1 != ch.length) && ch[i] == 'I' && ch[i+1] == 'X') {
                        i++;
                        sum += 9;
                    } else sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if ((i + 1 != ch.length) && ch[i] == 'X' && ch[i+1] == 'L') {
                        i++;
                        sum += 40;
                    } else if ((i + 1 != ch.length) && ch[i] == 'X' && ch[i+1] == 'C') {
                        i++;
                        sum += 90;
                    } else sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if ((i + 1 != ch.length) && ch[i] == 'C' && ch[i+1] == 'D') {
                        i++;
                        sum += 400;
                    } else if ((i + 1 != ch.length) && ch[i] == 'C' && ch[i+1] == 'M') {
                        i++;
                        sum += 900;
                    } else sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}