import java.util.HashMap;

public class RomanRefactor {

    public static int romanToInt(String s) {
        int total = 0; 

        HashMap<String, Integer> romanLookUp = new HashMap<>(); 
            romanLookUp.put("I",1);
            romanLookUp.put("V",5);
            romanLookUp.put("X",10);
            romanLookUp.put("L",50);
            romanLookUp.put("C",100);
            romanLookUp.put("D",500);
            romanLookUp.put("M",1000);
        
        for(int i = 0; i < s.length(); i++) { 
            if(s.substring(i, i+1).equals("I") && i != s.length() - 1) { 
                System.out.println("1");
                if(s.substring(i+1, i+2).equals("V")) { 
                    total += 4;
                    i++;
                    System.out.println("2");
                    continue;
                } else if (s.substring(i+1, i+2).equals("X")) { 
                    total += 9; 
                    i++;
                    System.out.println("3");
                    continue;
                }

            }

            if(s.substring(i, i+1).equals("X") && i != s.length() - 1) { 
                System.out.println("4");
                if(s.substring(i+1, i+2).equals("L")) { 
                    total += 40;
                    i++;
                    System.out.println("5");
                    continue;
                } else if (s.substring(i+1, i+2).equals("C")) { 
                    total += 90; 
                    i++;
                    System.out.println("6");
                    continue;
                }
            }

            if(s.substring(i, i+1).equals("C") && i != s.length() - 1) {
                System.out.println("7"); 
                if(s.substring(i+1, i+2).equals("D")) { 
                    total += 400;
                    i++;
                    System.out.println("8");
                    continue;
                } else if (s.substring(i+1, i+2).equals("M")) { 
                    total += 900; 
                    i++;
                    System.out.println("9");
                    continue;
                }
            }
            total += romanLookUp.get(s.substring(i, i+1));        
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        
    }
}
