import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
        FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to ABC Market");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Shop Management");
			System.out.println("\t3. Shop Product Management");
			System.out.println("\t4. Product Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
			switch(choice)
			{
				case 1:
					System.out.println("---------------------------------");
					System.out.println("You have chosen Employee Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search An Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You have chosen to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(m.insertEmployee(e1))
							{
								System.out.println("Employee Inserted with ID: "+e1.getEmpId());
							}
							else
							{
								System.out.println("Employee Can Not be Insertd......");
							}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = m.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(m.removeEmployee(e2))
								{ 
							         System.out.println("Employee Removed with ID: "+e2.getEmpId());
								}
								else
								{
									System.out.println("Employee Can Not be Removed......");
							    }
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
				
							m.showAllEmployees();
							
							break;
							
						case 4:
						System.out.println("---------------------------------");
							System.out.println("You have chosen to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = new Employee();
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
						
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
					}
					
					break;
				
				case 2: 
					System.out.println("---------------------------------");
					System.out.println("You have chosen Shop  Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Shop");
					System.out.println("\t2. Remove Existing Shop");
					System.out.println("\t3. Search A Shop");
					System.out.println("\t4. Show All Shops");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("---------------------------------");
							System.out.println("You have chosen to Insert A Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter SID: ");
							String sid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							Shop s1 ;
							s1.setSid(sid1);
							s1.setName(name1);
							
							if(m.insertShop(s1))
							{
								System.out.println("Shop Inserted with SID: "+s1.getSid());
							}
							else
							{
								System.out.println("Shop can not be inserted");
							}
							
							break;
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Remove A Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter SID : ");
							String sid2 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name2 = sc.next();
							
							Shop s2 =m.searchShop(sid2);
							
							if(s2 != null)
							{
								if(m.removeShop(s2))
								{
									System.out.println("Shop Removed with SID: "+s2.getSid());
								}
								else
								{
									System.out.println("Shop Can Not be Removed......");
								}
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
						
							break;
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You have chosen see all Shops");
							System.out.println("---------------------------------");
							
							m.showAllShops();
						
							break;
							
						case 4:
						
							
							System.out.println("---------------------------------");
							System.out.println("You have chosen to Search a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter SID: ");
							String sid3 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name3 = sc.next();
							
							Shop s3 = m.searchShop(sid3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found");
								System.out.println("Shop Name: "+s3.getName());
								System.out.println("SID: "+s3.getSid());
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							
							
							break;
							
							
						case 5:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							break;
							
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
				
				case 3:
					System.out.println("---------------------------------");
					System.out.println("You have chosen Shop Product Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Product for a Shop");
					System.out.println("\t2. Remove Existing Product of a Shop");
					System.out.println("\t3. Search A Product for a Shop");
					System.out.println("\t4. Show All Products of a Shop");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						
						case 1:
							
							System.out.println("---------------------------------");
							System.out.println("You have chosen to Insert a New Product for a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter SID: ");
							String sid1 = sc.next();
							
							if(m.searchShop(sid1) != null)
							{
								System.out.println("\tWhat type of product do you want to insert?");
								System.out.println("\t1. Local Product");
								System.out.println("\t2. Imported Product");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Product Type: ");
								int productType = sc.nextInt();
								
								if(productType == 1)
								{
									System.out.print("Enter PID: ");
									String pp1 = sc.next();
									System.out.print("Enter Product Name: ");
									String pn1 = sc.next();
									System.out.print("Enter Product Quantity: ");
									int pq1 = sc.nextInt();
									System.out.print("Enter Product Price: ");
									double pr1 = sc.nextDouble();
									System.out.print("Enter Discount Rate: ");
									double dr1 = sc.nextDouble();

									
									
									LocalProduct lp1 = new LocalProduct();
									lp1.setPid(pp1);
									lp1.setName(pn1);
									lp1.setAvailableQuantity(pq1);
									lp1.setPrice(pr1);
									lp1.setDiscountRate(dr1);
									
									if(m.searchShop(sid1).insertProduct(lp1))
									{
										System.out.println("New Product Inserted for "+ sid1 + " with Product PID " + pp1);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
									
									
								}
								else if(productType == 2)
								{
									System.out.print("Enter PID: ");
									String pp1 = sc.next();
									System.out.print("Enter Product Name: ");
									String pn1 = sc.next();
									System.out.print("Enter Product Quantity: ");
									int pq1 = sc.nextInt();
									System.out.print("Enter Product Price: ");
									double pr1 = sc.nextDouble();
									System.out.print("Enter Country name");
									String cn1 =sc.next();
									
									ImportedProduct ip1 = new ImportedProduct();
									ip1.setPid(pp1);
									ip1.setName(pn1);
									ip1.setAvailableQuantity(pq1);
									ip1.setPrice(pr1);
									ip1.setCountryName(cn1);
									
									
									if(m.searchShop(sid1).insertProduct(ip1))
									{
										System.out.println("Product Inserted for "+ sid1 + " with PID " + pp1);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
								}
								else if(productType == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid Product Type");
								}
							}
							else
							{
								System.out.println("SID MISMATCH");
							}
							
							break;
							
						case 2:
						System.out.println("---------------------------------");
							System.out.println("You have chosen to Remove an Existing Product for a Shop");
							System.out.println("---------------------------------");
							
							System.out.print("Enter SID: ");
							String sid2 = sc.next();
							
							if(m.searchShop(sid2) != null)
							{
								System.out.println("\tWhat type of product do you want to remove?");
								System.out.println("\t1. Local Product");
								System.out.println("\t2. Imported Product");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Product Type: ");
								int productType = sc.nextInt();
								
								if(productType == 1)
								{
									System.out.print("Enter PID: ");
									String pp2 = sc.next();
									System.out.print("Enter Product Name: ");
									String pn2 = sc.next();
									System.out.print("Enter Product Quantity: ");
									int pq2 = sc.nextInt();
									System.out.print("Enter Product Price: ");
									double pr2 = sc.nextDouble();
									System.out.print("Enter Discount Rate: ");
									double dr2 = sc.nextDouble();

									
									
									LocalProduct lp2 = new LocalProduct();
									lp2.setPid(pp2);
									lp2.setName(pn2);
									lp2.setAvailableQuantity(pq2);
									lp2.setPrice(pr2);
									lp2.setDiscountRate(dr2);
									
									if(m.searchShop(sid2).insertProduct(lp2))
									{
										System.out.println("New Product Inserted for "+ sid2 + " with Product PID " + pp2);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
									
									
								}
								else if(productType == 2)
								{
									System.out.print("Enter PID: ");
									String pp2 = sc.next();
									System.out.print("Enter Product Name: ");
									String pn2 = sc.next();
									System.out.print("Enter Product Quantity: ");
									int pq2 = sc.nextInt();
									System.out.print("Enter Product Price: ");
									double pr2 = sc.nextDouble();
									System.out.print("Enter Country name");
									String cn2 =sc.next();
									
									ImportedProduct ip2 = new ImportedProduct();
									ip2.setPid(pp2);
									ip2.setName(pn2);
									ip2.setAvailableQuantity(pq2);
									ip2.setPrice(pr2);
									ip2.setCountryName(cn2);
									
									
									if(m.searchShop(sid2).insertProduct(ip2))
									{
										System.out.println("Product Inserted for "+ sid2 + " with PID " + pp2);
									}
									else
									{
										System.out.println("Product Can Not Be Inserted");
									}
								}
								else if(productType == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid Product Type");
								}
							}
							else
							{
								System.out.println("SID MISMATCH");
							}
							
						
							break;
							
						case 3:
						
							System.out.println("---------------------------------");
							System.out.println("You have chosen see all Products");
							System.out.println("---------------------------------");
							
							m.showAllShops();
						
							break;
							
						case 4:
							
							System.out.println("---------------------------------");
							System.out.println("You have chosen to Search a Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter PID: ");
							String pp3 = sc.next();
							System.out.print("Enter Product Name: ");
							String pn3 = sc.next();
							
							Product p3 =m.searchProduct(pp3);
							
							if(p3 != null)
							{
								System.out.println("Product Found");
								System.out.println("Product Name: "+p3.getName());
								System.out.println("PID: "+p3.getPid());
							}
							else
							{
								System.out.println("Shop Does Not Exist");
							}
							break;
						
						case 5:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							break;
							
						default:
						    System.out.println("Invalid Option............");
							
							break;
					}
					
					break;
					
				case 4:
					System.out.println("---------------------------------");
					System.out.println("You have chosen Product Quantity Add-Sell");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Product");
					System.out.println("\t2. Sell Product");
					System.out.println("\t3. Show Add Sell History ");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							System.out.println("---------------------------------");
							System.out.println("You have chosen to Add a Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop SID: ");
							String sid1 = sc.next();
							
							if(m.searchShop(sid1) != null)
							{
								System.out.print("Enter Product PID: ");
								String pp1 = sc.next();
								
								if(m.searchShop(sid1).searchProduct(pp1) != null)
								{
									System.out.print("Enter Product Quantity: ");
									int pq1 = sc.nextInt();
									
									if(m.searchShop(sid1).searchProduct(pp1).addQuantity(pq1))
									{
										System.out.println("Product Added");
										frwd.writeInFile("Add : "+ pq1 +" product " + pp1 + " by " + sid1);
									}
									else
									{
										System.out.println("Can Not Add");
									}
								}
								else
								{
									System.out.println("Invalid PID");
								}
								
							}
							else
							{
								System.out.println("SID MISMATCH");
							}
							break;
							
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You have chosen to Sell a Product");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Shop SID: ");
							String sid2 = sc.next();
							
							if(m.searchShop(sid2) != null)
							{
								System.out.print("Enter Product PID: ");
								String pp2 = sc.next();
								
								if(m.searchShop(sid2).searchProduct(pp2) != null)
								{
									System.out.print("Enter Product Quantity: ");
									int pq2 = sc.nextInt();
									
									if(m.searchShop(sid2).searchProduct(pp2).sellQuantity(pq2))
									{
										System.out.println("Product Sold");
										frwd.writeInFile("Add : "+ pq2 +" product " + pp2 + " by " + sid2);
									}
									else
									{
										System.out.println("Can Not Sell");
									}
								}
								else
								{
									System.out.println("Invalid PID");
								}
								
							}
							else
							{
								System.out.println("SID MISMATCH");
							}
							
							break;
							
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You have chosen to see Add Sell History");
							System.out.println("---------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
						
							break;
							
						default:
						    System.out.println("Invalid Option............");
						
							break;
					}
					
					break;
			}
			System.out.println("-----------------------------------\n");
		}
	}
}