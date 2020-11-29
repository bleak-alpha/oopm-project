import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class currConv
{   private float[][] convData;
    
    public File currData = new File("currData.txt");
    
    //File creation, writing, reading, isempty
    public void currFile()
    {   try
        {   if (currData.createNewFile())
               System.out.print("File created....");
            else
               System.out.print("File Exists....");
        }
        catch(IOException e)
        {   System.out.print("An Error Occured....");
            e.printStackTrace();
        }
    }

    public void currWrite()
    {   Scanner writer = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
         {    for(int j = 0; i < 6; j++)
              {   System.out.print("("+i+","+j+")");
                  convData[i][j] = writer.nextFloat();
              }
         }
        
        writer.close();
    }

    public void currWriteFile()
    {   try
         {   FileOutputStream fos = new FileOutputStream("currData.txt");   
             DataOutputStream dos = new DataOutputStream(fos);
             
             for(int i=0; i<6; i++)
             {   for(int j=0; j<6; i++)
                     dos.writeFloat(convData[i][j]);
             }
             
             dos.close();
         }
        catch(IOException e)
            {System.out.print("IO Exception error: "+e);}   
    }

    public void currReadFile()
    {   try
        {  FileInputStream fin = new FileInputStream("currData.txt");
           DataInputStream dis = new DataInputStream(fin);

           for (int i=0; i<6; i++)
           {   for(int j=0; j<6; j++)
                  convData[i][j] = dis.readFloat();
           }

           dis.close();
        }
        catch(FileNotFoundException fe)
            {System.out.print("File Not Found, error: "+fe);}
        catch(IOException e)
            {System.out.print("IO Exception, error: "+e);}
    }

    public boolean FileEmpty()
    { if (currData.length() == 0)  return true;
      else return false;
    }
    
    //currency conversion methods

    //INR to others
    public void INRtoINR(float currency)
    {System.out.print("INR "+(currency));}

    public void INRtoUSD(float currency)
    {System.out.print("USD "+(currency*convData[1][2]));}

    public void INRtoEUR(float currency)
    {System.out.print("EUR "+(currency*convData[1][3]));}

    public void INRtoYEN(float currency)
    {System.out.print("YEN "+(currency*convData[1][4]));}

    public void INRtoGBP(float currency)
    {System.out.print("GBP "+(currency*convData[1][5]));}

    public void INRtoAUD(float currency)
    {System.out.print("AUD "+(currency*convData[1][6]));}


    //USD to others
    public void USDtoINR(float currency)
    {System.out.print("INR "+(currency*convData[2][1]));}

    public void USDtoUSD(float currency)
    {System.out.print("USD "+currency);}

    public void USDtoEUR(float currency)
    {System.out.print("EUR "+(currency*convData[2][3]));}

    public void USDtoYEN(float currency)
    {System.out.print("YEN "+(currency*convData[2][4]));}

    public void USDtoGBP(float currency)
    {System.out.print("GBP "+(currency*convData[2][5]));}

    public void USDtoAUD(float currency)
    {System.out.print("AUD "+(currency*convData[2][6]));}


    //EUR to others
    public void EURtoINR(float currency)
    {System.out.print("INR "+(currency*convData[3][1]));}

    public void EURtoUSD(float currency)
    {System.out.print("USD "+(currency*convData[3][2]));}

    public void EURtoEUR(float currency)
    {System.out.print("EUR "+currency);}

    public void EURtoYEN(float currency)
    {System.out.print("YEN "+(currency*convData[3][4]));}

    public void EURtoGBP(float currency)
    {System.out.print("GBP "+(currency*convData[3][5]));}

    public void EURtoAUD(float currency)
    {System.out.print("AUD "+(currency*convData[3][6]));}


    //YEN to others
    public void YENtoINR(float currency)
    {System.out.print("INR "+(currency*convData[4][1]));}

    public void YENtoUSD(float currency)
    {System.out.print("USD "+(currency*convData[4][2]));}

    public void YENtoEUR(float currency)
    {System.out.print("EUR "+(currency*convData[4][3]));}

    public void YENtoYEN(float currency)
    {System.out.print("YEN "+currency);}

    public void YENtoGBP(float currency)
    {System.out.print("GBP "+(currency*convData[4][5]));}

    public void YENtoAUD(float currency)
    {System.out.print("AUD "+(currency*convData[4][6]));}


    //GBP to others
    public void GBPtoINR(float currency)
    {System.out.print("INR "+(currency*convData[5][1]));}

    public void GBPtoUSD(float currency)
    {System.out.print("USD "+(currency*convData[5][2]));}

    public void GBPtoEUR(float currency)
    {System.out.print("EUR "+(currency*convData[5][3]));}

    public void GBPtoYEN(float currency)
    {System.out.print("YEN "+(currency*convData[5][4]));}

    public void GBPtoGBP(float currency)
    {System.out.print("GBP "+currency);}

    public void GBPtoAUD(float currency)
    {System.out.print("AUD "+(currency*convData[5][6]));}

    
    //AUD to others
    public void AUDtoINR(float currency)
    {System.out.print("INR "+(currency*convData[6][1]));}

    public void AUDtoUSD(float currency)
    {System.out.print("USD "+(currency*convData[6][2]));}

    public void AUDtoEUR(float currency)
    {System.out.print("EUR "+(currency*convData[6][3]));}

    public void AUDtoYEN(float currency)
    {System.out.print("YEN "+(currency*convData[6][4]));}

    public void AUDtoGBP(float currency)
    {System.out.print("GBP "+(currency*convData[6][5]));}

    public void AUDtoAUD(float currency)
    {System.out.print("AUD "+currency);}
}


class CurrConvTest
{ public static void main(String[] args)
    {  currConv conversion = new currConv();
       
        //Intializing
       if(conversion.currData.exists())
        {  System.out.print("file found....");
          
            if(conversion.FileEmpty());
            {System.out.print("file is empty!");
             System.out.print("Enter the data into the file:");
             conversion.currWrite();
             System.out.print("Saving Data....");             
            }
        }
        else if (conversion.FileEmpty() == false)
        {    System.out.print("data found....");
             System.out.print("reading data....");
             conversion.currReadFile();            
        }
        else if (conversion.currData.exists() == false)
        {   System.out.print("file not found....");
            System.out.print("creating file.....");
            conversion.currFile();
            System.out.print("Enter the data into the file:");
            conversion.currWrite();
        }
        

        //switch case for various combination of choices
        String ch1, ch2;
        float currency;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Amount: ");
        currency = input.nextFloat();

        System.out.print("[1]Indian Ruppee \t [2]US Dollar \t [3]European Euro \n [4]Japanese Yen \t [5]Great Britain Pound \t [6]Australian Dollar");
        
        System.out.print("Input Currency: ");
        ch1 = input.nextLine();

        System.out.print("Output Currency: ");
        ch2 = input.nextLine();
        input.close();

        switch (ch1)
        {  case ("1"):
            switch (ch2)
            { case ("1"):
              conversion.INRtoINR(currency);
              break;

              case ("2"):
              conversion.INRtoUSD(currency);
              break;

              case ("3"):
              conversion.INRtoEUR(currency);
              break;

              case ("4"):
              conversion.INRtoYEN(currency);
              break;
              
              case ("5"):
              conversion.INRtoGBP(currency);
              break;

              case ("6"):
              conversion.INRtoAUD(currency);
              break;
            }
            
        }
    }
}