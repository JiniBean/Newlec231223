//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.util.Scanner;
//
//
//public class ProductRepository {
//
//	public ProductList findAll() throws IOException {
//
//		ProductList list = new ProductList();
//
//		FileInputStream stream = new FileInputStream("res/product.txt");
//		Scanner scan = new Scanner(stream);
//
//		//컬럼 버리기
//		if(scan.hasNextLine())
//			scan.nextLine();
//
//
//		while(scan.hasNextLine()) {
//
//			Product product = new Product();
//
//			String line = scan.nextLine();
//			String[] tokens = line.split(",");
//
//			product.setId(Integer.parseInt(tokens[0]) );
//			product.setCategory(tokens[1]);
//			product.setName(tokens[2]);
//			product.setCost(Integer.parseInt(tokens[3]) );
//			product.setStock(Integer.parseInt(tokens[4]) );
//			product.setDetail(tokens[5]);
//
//			list.add(product);
//		}
//		scan.close();
//		stream.close();
//
//		return list;
//	}
//
//
//
//
//	public void save(Product product) throws IOException {
//		FileOutputStream stream = new FileOutputStream("res/Product.txt", true);
//		PrintStream pis = new PrintStream(stream);
//
//		pis.printf("\n%d,%s,%s,%d,%d,%s", product.getId(), product.getCategory(), product.getName(), product.getCost(), product.getStock(), product.getDetail() );
//
//		pis.close();
//		stream.close();
//	}
//
//
//}
