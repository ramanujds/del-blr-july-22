```text

Problem Statement : Resident Repository
A city hospital has announced a full body check-up, free of cost, for its local residents. People who wish to avail this facility can use the hospital’s website to register themselves. The registration form requires you to fill in the following details:
**Full Name
**Social Security number
**Gender (M/F)
**Implement the following functionalities in the program:
      1. Create a list of all the residents. 
      2. Search for people with their social security number.
      3. Sort the name of the residents in alphabetical order. 
      4. Fetch the list of residents based on their gender.

Sample Code -
public class Resident {

    //declare the variables

    //getter setter

    //constructor

    //override toString method

}

Service Layer
public class ResidentService {

    private static List<Resident> residentsRepository = new ArrayList<>();

    ResidentService(){

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident) throws DuplicateResidentException {

        return false;
    }

   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber) throws ResidentNotFoundException{

       return null;

    }

   // Sort the name of the residents in alphabetical order.

    public List getAllNamesSorted(List residentsRepository){

        return null;

    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender){


       return null;
    }

}

```
