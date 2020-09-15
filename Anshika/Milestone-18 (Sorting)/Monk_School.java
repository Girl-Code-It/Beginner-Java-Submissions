//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/monks-school-4/description/


import java.util.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;


class Monk_School
 {
    public static void main(String args[] ) throws Exception {
        
       // Scanner sc=new Scanner (System.in);
        InputReader sc = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);

        int t=sc.nextInt();
        int st=sc.nextInt();

        String teach[]=new String[t];
        for (int i=0; i<t; i++)
        {
            teach[i]=sc.next();
        }

        String te[]=new String[st];
        String stu[]=new String[st];
        int age[]=new int[st];

        for (int i=0; i<st; i++)
        {
            te[i]=sc.next();
            stu[i]=sc.next();
            age[i]=sc.nextInt();
        }

        mergeSort(teach,0,t-1);
        MergeSort(te,stu,age,0,st-1);

        ArrayList<ArrayList<String>> l1=new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<Integer>> l2=new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<t; i++)
        {
            l1.add(new ArrayList<String>());
            l2.add(new ArrayList<Integer>());

            for (int j=0; j<st; j++)
            {
                if (teach[i].equals(te[j]))
                {
                    l1.get(i).add(stu[j]);
                    l2.get(i).add(age[j]);
                }
            }
        }

        for (int i=0; i<t; i++)
        {
            System.out.println (teach[i]);
            for (int j=0; j<l1.get(i).size(); j++)
            {
                System.out.print (l1.get(i).get(j)+" ");
                System.out.println (l2.get(i).get(j)+" ");
            }
        }

        out.close();
    }

    static void MergeSort (String[] a, String[] b, int[]ar, int min, int max)
    {
        if (min<max)
        {
            int mid=(min+max)/2;

            MergeSort(a,b,ar,min,mid);
            MergeSort(a,b,ar,mid+1,max);

            Merge(a,b,ar,min,mid,max); 
        }
    }

    static void Merge (String[] aaa, String[] b, int[] ar, int min, int mid, int max)
    {
        int i=min, j=mid+1, x=0;
        int a[]=new int[max-min+1];
        String aa[]=new String[max-min+1];
        String bb[]=new String[max-min+1];

        while (i<=mid && j<=max)
        {
            if (ar[i]<ar[j])
            {
                a[x]=ar[i];
                aa[x]=aaa[i];
                bb[x]=b[i];
                i++;
            }
            else
            {
                a[x]=ar[j];
                aa[x]=aaa[j];
                bb[x]=b[j];
                j++;
            }
            x++;
        }

        for (int k=i; k<=mid; k++)
        {
            a[x]=ar[k];
            aa[x]=aaa[k];
            bb[x]=b[k];
            x++;
        }

        for (int k=j; k<=max; k++)
        {
            a[x]=ar[k];
            aa[x]=aaa[k];
            bb[x]=b[k];
            x++;
        }
        
        int z=0;
        for (int k=min; k<=max; k++)
        {
            ar[k]=a[z];
            aaa[k]=aa[z];
            b[k]=bb[z];
            z++;
        }
    }

    static void mergeSort (String[]ar, int min, int max)
    {
        if (min<max)
        {
            int mid=(min+max)/2;

            mergeSort(ar,min,mid);
            mergeSort(ar,mid+1,max);

            merge(ar,min,mid,max); 
        }
    }

    static void merge (String[] ar, int min, int mid, int max)
    {
        int i=min, j=mid+1, x=0;
        String a[]=new String[max-min+1];

        while (i<=mid && j<=max)
        {
            if (ar[i].compareTo(ar[j])<0)
            {
                a[x]=ar[i];
                i++;
            }
            else
            {
                a[x]=ar[j];
                j++;
            }
            x++;
        }

        for (int k=i; k<=mid; k++)
        {
            a[x]=ar[k];
            x++;
        }

        for (int k=j; k<=max; k++)
        {
            a[x]=ar[k];
            x++;
        }
        
        int z=0;
        for (int k=min; k<=max; k++)
        {
            ar[k]=a[z++];
        }
    }

    static class InputReader {
    private boolean finished = false;
 
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;
 
    public InputReader(InputStream stream) {
        this.stream = stream;
    }
 
    public int read() {
        if (numChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }
 
    public int peek() {
        if (numChars == -1) {
            return -1;
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                return -1;
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar];
    }
 
    public int nextInt() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public long nextLong() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public String nextString() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        StringBuilder res = new StringBuilder();
        do {
            if (Character.isValidCodePoint(c)) {
                res.appendCodePoint(c);
            }
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }
 
    public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return isWhitespace(c);
    }
 
    public static boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
 
    private String readLine0() {
        StringBuilder buf = new StringBuilder();
        int c = read();
        while (c != '\n' && c != -1) {
            if (c != '\r') {
                buf.appendCodePoint(c);
            }
            c = read();
        }
        return buf.toString();
    }
 
    public String readLine() {
        String s = readLine0();
        while (s.trim().length() == 0) {
            s = readLine0();
        }
        return s;
    }
 
    public String readLine(boolean ignoreEmptyLines) {
        if (ignoreEmptyLines) {
            return readLine();
        } else {
            return readLine0();
        }
    }
 
    public BigInteger readBigInteger() {
        try {
            return new BigInteger(nextString());
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }
 
    public char nextCharacter() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        return (char) c;
    }
 
    public double nextDouble() {
        int c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        double res = 0;
        while (!isSpaceChar(c) && c != '.') {
            if (c == 'e' || c == 'E') {
                return res * Math.pow(10, nextInt());
            }
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = read();
        }
        if (c == '.') {
            c = read();
            double m = 1;
            while (!isSpaceChar(c)) {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nextInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                m /= 10;
                res += (c - '0') * m;
                c = read();
            }
        }
        return res * sgn;
    }
 
    public boolean isExhausted() {
        int value;
        while (isSpaceChar(value = peek()) && value != -1) {
            read();
        }
        return value == -1;
    }
 
    public String next() {
        return nextString();
    }
 
    public SpaceCharFilter getFilter() {
        return filter;
    }
 
    public void setFilter(SpaceCharFilter filter) {
        this.filter = filter;
    }
 
    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);
    }
    public int[] nextIntArray(int n){
        int[] array=new int[n];
        for(int i=0;i<n;++i)array[i]=nextInt();
        return array;
    }
    public int[] nextSortedIntArray(int n){
        int array[]=nextIntArray(n);
        Arrays.sort(array);
        return array;
    }
    public int[] nextSumIntArray(int n){
        int[] array=new int[n];
        array[0]=nextInt();
        for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
        return array;
    }
    public long[] nextLongArray(int n){
        long[] array=new long[n];
        for(int i=0;i<n;++i)array[i]=nextLong();
        return array;
    }
    public long[] nextSumLongArray(int n){
        long[] array=new long[n];
        array[0]=nextInt();
        for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
        return array;
    }
    public long[] nextSortedLongArray(int n){
        long array[]=nextLongArray(n);
        Arrays.sort(array);
        return array;
    }
}
 
static class OutputWriter {
    private final PrintWriter writer;
 
    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
 
    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }
 
    public void print(char[] array) {
        writer.print(array);
    }
 
    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }
 
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(array[i]);
        }
    }
 
    public void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(array[i]);
        }
    }
 
    public void print(long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(array[i]);
        }
    }
 
    public void println(int[] array) {
        print(array);
        writer.println();
    }
 
    public void println(double[] array) {
        print(array);
        writer.println();
    }
 
    public void println(long[] array) {
        print(array);
        writer.println();
    }
 
    public void println() {
        writer.println();
    }
 
    public void println(Object... objects) {
        print(objects);
        writer.println();
    }
 
    public void print(char i) {
        writer.print(i);
    }
 
    public void println(char i) {
        writer.println(i);
    }
 
    public void println(char[] array) {
        writer.println(array);
    }
 
    public void printf(String format, Object... objects) {
        writer.printf(format, objects);
    }
 
    public void close() {
        writer.close();
    }
 
    public void flush() {
        writer.flush();
    }
 
    public void print(long i) {
        writer.print(i);
    }
 
    public void println(long i) {
        writer.println(i);
    }
 
    public void print(int i) {
        writer.print(i);
    }
 
    public void println(int i) {
        writer.println(i);
    }
 
    public void separateLines(int[] array) {
        for (int i : array) {
            println(i);
        }
    }
}
}
