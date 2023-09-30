package 프로그래머스;

class 전화번호목록2 {
    전화번호목록2[] child;
    boolean end;

    public 전화번호목록2() {
        child = new 전화번호목록2[10];
        end = false;
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        전화번호목록2 root = new 전화번호목록2();
        for (String phoneNumber : phone_book) {
            if(!root.insert(phoneNumber)) {
                return false;
            }
        }
        return true;
    }

    boolean insert(String phoneNumber) {
        전화번호목록2 current = this;
        for(char ch : phoneNumber.toCharArray()) {
            int index = ch - '0';

            if (current.child[index] == null) {
                current.child[index] = new 전화번호목록2();
            }
            current = current.child[index];
            if (current.end) {
                return false;
            }
        }
        current.end = true;
        for (전화번호목록2 solution : current.child) {
            if (solution != null) return false;
        }
        return true;
    }
}