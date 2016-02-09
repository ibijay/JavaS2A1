class VoteAgeElig 
{
	public static void main(String args[])
	{
		int i_elg_age_s =18, i_voter_age_v = Integer.parseInt(args[0]);
		if (i_voter_age_v>=i_elg_age_s)
		{
			System.out.println("Yes you are eligible to vote");
		}
		else
		{
			System.out.println("No you are not eligible to vote");
		}	
	}
}