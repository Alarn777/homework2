package homework2.Inheritance.romanticDate;

public class Meeting
{
    private String location;
    private Person participants[];
    public Meeting(String locationVal, Person[] participantsVal)
    {
        super();
        this.location = locationVal;
        this.participants = participantsVal;
    }
    public Person getParticipant(int index)
    {
        return participants[index];
    }
    public String toString()
    {
        StringBuffer sb = new StringBuffer("location="+location);
        for(int i=0; i<participants.length; i++)
        {
            sb.append("\nparticipant #"+i+"="+participants[i].toString());
        }
        return sb.toString();
    }
}

