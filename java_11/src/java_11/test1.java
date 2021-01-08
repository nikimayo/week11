package java_11;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class test1 {
	 static class Book{
	        private String ISBN;
	        private String name;
	        private int price;
	        private String press;
	        public Book(String index,String name,int price,String press){
	            this.ISBN = index;
	            this.name = name;
	            this.price = price;
	            this.press = press;
	        }
	        public String getIndex(){
	            return this.ISBN;
	        }
	        public String getName(){
	            return this.name;
	        }
	        public int getPrice(){
	            return this.price;
	        }
	        public String getPress(){
	            return this.press;
	        }
	        public void setIndex(String index){
	            this.ISBN= index;
	        }
	        public void setName(String name){
	            this.name = name;
	        }
	        public void setPrice(int price){
	            this.price = price;
	        }
	        public void setPress(String press){
	            this.press = press;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        List<Book> books = new ArrayList<Book>();
	        Map<String,Book> books1 = new HashMap<String,Book>();
	        int n = input.nextInt();
	        for(int i = 0;i < n;++ i){
	            String name,index,press,str;
	            int price;
	            index = input.next();
	            name = input.next();
	            price = input.nextInt();
	            press = input.next();
	            Book x = new Book(index,name,price,press);
	            books.add(x);
	            books1.put(index,x);
	        }
	        
	        Iterator it = books.iterator();
	        while(it.hasNext()){
	            Book book = (Book) it.next();
	            System.out.println(book.getName());
	        }
	       
	        Iterator it1 = books1.entrySet().iterator();
	        while(it1.hasNext()){
	            Map.Entry entry = (Map.Entry)it1.next();
	            System.out.println(entry.getKey() + " " + ((Book)entry.getValue()).getName());
	        }
	    }
	}

