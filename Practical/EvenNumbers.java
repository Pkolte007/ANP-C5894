package loops;

public class EvenNumbers 
{
	public static void main(String[] args)
	{
		//num initialized to 1
        int num = 1;
        
        //sum intialized to 0
        int sum = 0;
        while (num <= 100)
        {
        	if (num % 2 == 0)
            {
                sum += num;
            }
            //num is incremented by 1
            num++;

        }
        System.out.println("Sum of Even Numbers:" + sum);


	}

}
