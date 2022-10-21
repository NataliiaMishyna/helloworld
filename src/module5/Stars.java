package module5;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString(){
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        int countV = count;

        for (int i = 0; i < 4; i++){
            int j = countV%10;
            countV = countV / 10;
            if (i == 0){
                while(j>0){
                    s4 = s4 + "*";
                    j--;
                }
            }

            if (i == 1){
                while(j>0){
                    s3 = s3 + "Z";
                    j--;
                }
            }

            if (i == 2){
                while(j>0){
                    s2 = s2 + "Y";
                    j--;
                }
            }

            if (i == 3){
                while(j>0){
                    s1 = s1 + "X";
                    j--;
                }
            }

        }
        return s1 + s2 + s3 + s4;

    }

    public static void main(String[] args){
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
