模拟学生作业处理的实验要求掌握字符串String，掌握文件读写，异常处理结构；<br>;
任务需求古诗进行断句<br>;
统计古诗中出现的字数次数<br>;
实验加入异常处理程序<br>;
首先构建学生的类<br>;
在学生的类中加入姓名，性别，年龄，学号等属性<br>;
例如：
String Name<br>;
	String Sex<br>;
	int Age<br>;
	String Grade<br>;
	int id<br>;
建立java.io包，这个包的所有输入流都是抽象类InputStream字节数入流或是抽象类Read字符输入流的子类，所有输出流都是抽象类OUTPUTStream字节输出流或是抽象类Writer字符输出流<br>;
例如：
public static void main(String args[]) throws FileNotFoundException, IOException {
		
    
		Student stu=new Student();
		Scanner s=new Scanner(System.in);
		System.out.println("姓名：");		
		String Name =s.next();
		System.out.println("年龄:");
		int Age =s.nextInt();
		System.out.println("性别：");		
		String Sex =s.next();
		System.out.println("班级：");		
		String Grade =s.next();
		System.out.println("学号：");
		int Id =s.nextInt();
		stu.setId(Id);
文件创建通过File 类方法使用<br>;
例如：
File file = new File("D://src/A.txt");<br>;
<br>;
文件字节输入流使用FileInputStream类的构造方法创造指向文件的输入流<br>;
例如：
FileInputStream fis = new FileInputStream(file);
文件字节输出流使用FileOutputStream类的构造方法创造指向文件的输出流<br>;
例如：
ByteArrayOutputStream bos = new ByteArrayOutputStream();<br>;
异常处理会改变成程序的控制流程，让程序由机会对错误做出处理<br>;
try-catch语句可以用来处理异类将可能出现的异类操作放在tyr-catch语句中的try语句部分<br>;
try语句部分出现异常对象try部分将结束装入catch语句部分，所以将处理部分放入catch语句部分以应对try语句部分可能出现的异类结构<br>;
例如： try (FileReader fInputStream = new FileReader("D://src/A.txt");
	             FileWriter fOutputStream  = new FileWriter("D://src/B.txt")){
	            StringBuffer st=new StringBuffer();
              catch (IOException e) <br>;
这次实验需要通过更多的学习内容来完善这次的实验，面对一次较为大型的实验指令，我还是比较迷茫好多地方没有头绪。面对实验要求更是一脸茫然，在书本，同学等的帮助下我慢慢步入正轨，通过一次一次的错误与更改完善我的实验。让我知道即便是这种比较基础的实验也是对于我的一种考验，我需要更加的虚心完成更多的任务实验来加强我自己的实验指令
			
