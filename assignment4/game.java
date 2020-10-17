package assignment4;

public class game {
	 information[] questions=new information[3];
	    players player=new players();

	    String[] questionsdata={"Where is the railway staff college location?","Which of the following is used in pencils?","20th August is celebrated as?"};
	    String[] options1={"Pune","Magnrsium","Sadbhavana Divas"};
	    String[] options2={"Vadodara","Copper","Earth Day"};
	    String[] options3={"Delhi","Iron","No tobacco day"};
	    String[] options4={"Nagpur","Gold","Childrens day"};
	    int[] answers={2,3,1};


	    public void initgame()
	    {
//	        created three objects
	        for(int i=0;i<3;i++){
	            questions[i]=new information();
	        }
	        for(int i=0;i<3;i++)
	        {

	            questions[i].question=questionsdata[i];
	        questions[i].option1=options1[i];
	        questions[i].option2=options2[i];
	        questions[i].option3=options3[i];
	        questions[i].option4=options4[i];
	        questions[i].correctAnswer=answers[i];
	       
	        }


	    }
	    public void play()
	    {

	          player.Details();
	          for(int i=0;i<3;i++)
	          {
	              boolean status=questions[i].Question();
	              if(status==true)
	              {
	                  System.out.println("Correct");
	                  player.score=player.score+5;
	              }
	              else{
	                  System.out.println("Sorry wroung choice");
	                  player.score=player.score-5;
	              }
	          }

	        System.out.println(player.name+" your score is "+player.score);

	    }

	}


