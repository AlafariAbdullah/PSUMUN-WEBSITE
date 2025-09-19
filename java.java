import java.io.*;
import java.util.*;

public class SampleMajor2 {
public static void main(String[] args) {

ArrayList<TEST> movs = new ArrayList<TEST>();
Scanner fromFile = new Scanner(new File(“c:\\data\\TEST.txt”));
while(fromFile.nextLine()) {
String inpt = fromFile.nextLine();
inpt = input.tolowerCase(); 
String[] tokens = inpt.split(“#”);
TEST tst = new Movie(tokens[0], tokens[1], Integer.parseInt(tokens[2]);
if(!tst.contains(tst))  
tst.add(tst);  
} 
fromFile.close();
        
System.out.println(“Number of TEST entered: “ + tst.size());
System.out.println(“Number of TEST saves: “ + TEST.size());
Collections.sort(TEST);
System.out.println(TEST)
Collections.reverseOrder());
                 
public class TESTCLASSComparator implements Comparator<TEST> {

@Override
public int compare(TEST ref1, TEST ref2) {
if(ref1 == null || ref2 == null)
throw new NullPointerException(“Missing 1 or 2 objects!”);     
return(ref1.getTitle().compareTo(ref2.getTitle()));
}
}
        
Collections.sort(tst, new TESTCLASSComparator());

----------------------------------

ArrayList<String> lines = new ArrayList<String>();

Scanner fromFile = new Scanner(new File(System.in);
String str = new String(""); 
int num = 0;
while(fromFile.hasNextLine()) {
}
if(!str.equals("") && !num.contains(str)) 
num.add(str); 
} 
while(!str.equals(""));
-----------------------------
String name = new String(“KHALIED   KHALIED  KHALIED”);
name = name.trim().replaceAll(" +", " "); 
System.out.println(“The name with no extra spaces: “ + name);
 
String str = new String(KHALIED   KHALIED  KHALIED“);
str = str.trim();

String[] tokens = str.split(“ “);
for(i = 0; i < tokens.length; i++)
str += tokens[i];

------------------------------------

ArrayList<TEST> TST = new ArrayList<TEST>();
Collections.sort(TST);
arr.add(new TEST( , );

for(int i = 0; i < TST.size(); i++)
System.out.println(TST.get(i));  

Iterator<TEST> iter = TST.iterator();
while(iter.hasNext())
System.out.println(iter.next());

Collections.sort(arr);
System.out.println(arr.get(0));


TEST small = arr.get(0);
TEST large = arr.get(arr.size() - 1);
arr.set(0, large)
arr.set(arr.size() – 1, small);
System.out.println(arr);


public static void main(String[] args) throws IOException {

FileWriter file = new FileWriter(new File(text.txt”));

while(iter.hasNext()
file.write(iter.next()+ “\n”);

file.close();

HashMap<String, Double> TEST_map = new HashMap<String, Double>();
for(int i = 0; i < arr.size(); i++)
TEST_map.put(arr.get(i).getType(), arr.get(i).getsomthing());

public static void displayMap(HashMap<String, String> map) {
if(map == null)
throw new NullPointerException(“No map to print!”);
for(int i = 0; i < map.size(); i++) {     
}
System.out.println(map);
}