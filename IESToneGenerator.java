import java.util.*;
import javax.sound.sampled.*;
import java.io.*;

public class IESToneGenerator {
       public static float SAMPLE_RATE = 144000f;
    static byte[] Buf_10K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_10_5K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_11K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_11_5K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_12K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_12_5K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_13K = new byte[(int)(SAMPLE_RATE * .2)];
    static byte[] Buf_13_5K = new byte[(int)(SAMPLE_RATE * .2)];
    static AudioFormat af;
    static SourceDataLine sdl;

    
    public static void init(){
System.out.println("In the constructor");


try{
af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
sdl = AudioSystem.getSourceDataLine(af);
sdl.open(af);
sdl.start();
    }
catch(Exception e){
e.printStackTrace();
}
// Buf_10K
    for (int i=0; i<Buf_10K.length; i++) {
double angle = i / (SAMPLE_RATE / 10000) * 2.0 * Math.PI;
Buf_10K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_10K.length / 2; i++) {
Buf_10K[i] = (byte)(Buf_10K[i] * i / (SAMPLE_RATE / 100.0));
Buf_10K[Buf_10K.length-1-i] =
(byte)(Buf_10K[Buf_10K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}
    
// Buf_10_5K
    for (int i=0; i<Buf_10_5K.length; i++) {
double angle = i / (SAMPLE_RATE / 10500) * 2.0 * Math.PI;
Buf_10_5K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_10_5K.length / 2; i++) {
Buf_10_5K[i] = (byte)(Buf_10_5K[i] * i / (SAMPLE_RATE / 100.0));
Buf_10_5K[Buf_10_5K.length-1-i] =
(byte)(Buf_10_5K[Buf_10_5K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}


// Buf_11K
    for (int i=0; i<Buf_11K.length; i++) {
double angle = i / (SAMPLE_RATE / 11000) * 2.0 * Math.PI;
Buf_11K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_11K.length / 2; i++) {
Buf_11K[i] = (byte)(Buf_11K[i] * i / (SAMPLE_RATE / 100.0));
Buf_11K[Buf_11K.length-1-i] =
(byte)(Buf_11K[Buf_11K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}


 // Buf_11_5K
    for (int i=0; i<Buf_11_5K.length; i++) {
double angle = i / (SAMPLE_RATE / 11500) * 2.0 * Math.PI;
Buf_11_5K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_11_5K.length / 2; i++) {
Buf_11_5K[i] = (byte)(Buf_11_5K[i] * i / (SAMPLE_RATE / 100.0));
Buf_11_5K[Buf_11_5K.length-1-i] =
(byte)(Buf_11_5K[Buf_11_5K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}

// Buf_12K
    for (int i=0; i<Buf_12K.length; i++) {
double angle = i / (SAMPLE_RATE / 12000) * 2.0 * Math.PI;
Buf_12K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_12K.length / 2; i++) {
Buf_12K[i] = (byte)(Buf_12K[i] * i / (SAMPLE_RATE / 100.0));
Buf_12K[Buf_12K.length-1-i] =
(byte)(Buf_12K[Buf_12K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}

 // Buf_12_5K
    for (int i=0; i<Buf_12_5K.length; i++) {
double angle = i / (SAMPLE_RATE / 12500) * 2.0 * Math.PI;
Buf_12_5K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_12_5K.length / 2; i++) {
Buf_12_5K[i] = (byte)(Buf_12_5K[i] * i / (SAMPLE_RATE / 100.0));
Buf_12_5K[Buf_12_5K.length-1-i] =
(byte)(Buf_12_5K[Buf_12_5K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}

// Buf_13K
    for (int i=0; i<Buf_13K.length; i++) {
double angle = i / (SAMPLE_RATE / 13000) * 2.0 * Math.PI;
Buf_13K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_13K.length / 2; i++) {
Buf_13K[i] = (byte)(Buf_13K[i] * i / (SAMPLE_RATE / 100.0));
Buf_13K[Buf_13K.length-1-i] =
(byte)(Buf_13K[Buf_13K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}

// Buf_13_5K
    for (int i=0; i<Buf_13_5K.length; i++) {
double angle = i / (SAMPLE_RATE / 13500) * 2.0 * Math.PI;
Buf_13_5K[i] = (byte)(Math.sin(angle) * 127.0 * 1);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < Buf_13_5K.length / 2; i++) {
Buf_13_5K[i] = (byte)(Buf_13_5K[i] * i / (SAMPLE_RATE / 100.0));
Buf_13_5K[Buf_13_5K.length-1-i] =
(byte)(Buf_13_5K[Buf_13_5K.length-1-i] * i / (SAMPLE_RATE / 100.0));
}


    }// end constructor
    






public static void sound(int hz, int msecs, double vol)
throws LineUnavailableException {

if (hz <= 0)
throw new IllegalArgumentException("Frequency <= 0 hz");

if (msecs <= 0)
throw new IllegalArgumentException("Duration <= 0 msecs");

if (vol > 1.0 || vol < 0.0)
throw new IllegalArgumentException("Volume out of range 0.0 - 1.0");

byte[] buf = /*new byte[(int)SAMPLE_RATE * msecs / 1000];*/null;

    switch(hz){
        case 10000:
            buf = Buf_10K;
            //System.out.println("freq="+hz);
        break;
        case 10500:
            buf = Buf_10_5K;
            //System.out.println("freq="+hz);
        break;
        case 11000:
            buf = Buf_11K;
            //System.out.println("freq="+hz);
        break;
        case 11500:
            buf = Buf_11_5K;
            //System.out.println("freq="+hz);
        break;
        case 12000:
            buf = Buf_12K;
            //System.out.println("freq="+hz);
        break;
        case 12500:
            buf = Buf_12_5K;
            //System.out.println("freq="+hz);
        break;
        case 13000:
            buf = Buf_13K;
            //System.out.println("freq="+hz);
        break;
        case 13500:
            buf = Buf_13_5K;
            //System.out.println("freq="+hz);
        break;

    }// end switch

/*
for (int i=0; i<buf.length; i++) {
double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
buf[i] = (byte)(Math.sin(angle) * 127.0 * vol);
}

// shape the front and back 10ms of the wave form
for (int i=0; i < SAMPLE_RATE / 100.0 && i < buf.length / 2; i++) {
buf[i] = (byte)(buf[i] * i / (SAMPLE_RATE / 100.0));
buf[buf.length-1-i] =
(byte)(buf[buf.length-1-i] * i / (SAMPLE_RATE / 100.0));
}
*/
/*AudioFormat af = new AudioFormat(SAMPLE_RATE,8,1,true,false);
SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
sdl.open(af);
sdl.start();*/
sdl.write(buf,0,buf.length);
/*sdl.drain();
sdl.close();
  */

}

public static void main(String[] args) throws


LineUnavailableException {

    init();

    
   File f = new File(args[0]);
   //File f = new File("in.txt");
   //File f = new File("PIES_239UDBTest4_6.2_rawdata.txt");

try{

   FileReader fr = new FileReader(f);
   BufferedReader br = new BufferedReader(fr);
   String temp = "";
   Date timer;
   String []line = null;
   String []line2 = null;
   String temp1 = "";
   String sansTime = "";
   double time1 = 0;
   double time2 = 0;
   long currentTime = 0;
   long startTime = 0;
   int waitTime = 0;
   int freq = 0;
   int freq1 = 0;
   double markerTime=0.0;
   boolean done = false;
   long elapsedTime=0;
   
   
   
               if(br.ready()){
                temp = br.readLine();
                              }

               line =  temp.split(" ");

               if(line.length >= 5){
                    time1 = 1000 * new Double(line[3]).doubleValue();
                    freq = (int)(1000 * new Double(line[1]).doubleValue());
                    IESToneGenerator.sound(freq,100,0.8);
                    System.out.println(line[1]+"  time = " + line[3]);
                   }

               startTime = new Date().getTime();

   while(true && !done){
       long beginTime = 0;
       long theTime = 0 ;
   
   

       freq1 = freq;
       time2 = time1;
                waitTime=getWaitTime(time1,time2);
               while(br.ready() && freq == freq1 && waitTime < 5000){
                
                   temp1 = br.readLine();
                   line2 =  temp1.split(" ");
                    
                   if(line2.length >= 5){
                        freq1 = (int)(1000 * new Double(line2[1]).doubleValue());          
                        //System.out.println(line2[1]+"  time = " + line2[3]);
                        time2 = 1000 * new Double(line2[3]).doubleValue();
                        

                   }// end if
                  waitTime=getWaitTime(time1,time2);

               }// end while
       
               
    

                    waitTime=getWaitTime(time1,time2);
                    Thread.sleep(waitTime);
                   
                    startTime=currentTime;
                    elapsedTime=0;
                    
                    /*
                    while( elapsedTime <= (waitTime)){
                        currentTime = new Date().getTime();
                        elapsedTime = currentTime-startTime;


                    }//end while
                    */
                  IESToneGenerator.sound(freq1,50,1);
                    System.out.println("calc time = " + (elapsedTime)+" waitTime= "+waitTime);


            
         time1 = time2;
            line[1] = line2[1];
            freq= freq1;
                  



    }// end while

    }// end try
catch(Exception e){
    e.printStackTrace();

}// end catch

    }// end main


    static int getWaitTime(double time1, double time2){
        double time = 0.0;
        time = time2-time1;
        if(time < 0)
            time+=104857;

        return (int)time;
    }// end getDeckBoxElapsedTime

}// end class
