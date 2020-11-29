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
    private File currData = new File("currData.txt");
    
    //File creation, writing, reading 
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
    
}