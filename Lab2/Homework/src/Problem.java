import java.util.*;
public class Problem {
    private Location[] locations;
    private Road[] roads;

    public Problem(Location[] l, Road[] r) {
        this.locations = l;
        this.roads = r;
    }
    public boolean ValidInstance(){

        for(int i=0;i<locations.length-1;i++)
            for(int j=i+1;j< locations.length;j++)
            {
                if(locations[i].equals(locations[j])==true)
                    return false;
            }
        for(int i=0;i<roads.length-1;i++)
            for(int j=i+1;j< roads.length;j++)
            {
                if(roads[i].equals(roads[j])==true)
                    return false;
            }
        return true;
    }

    public void Print(){
        for (Location it : locations) {
            System.out.println(it);
        }
        for (Road r:roads) {
            System.out.println(r);
        }
    }
    public void PathBetweenCities(Location c1,Location c2){
        //Creeam graful cu locatiile
        Graph G = new Graph(locations.length);
        for (Road road:roads ){
            int location1=0;
            int location2=0;
            for(int i=0;i<locations.length;i++)
            {
                if(locations[i].getName()==road.getL1().getName())
                {location1=i;}
                if(locations[i].getName()==road.getL2().getName())
                {location2=i;}
            }
            G.addEdge(location1,location2);
        }
        int l1=0,l2=0;
        for(int i=0;i< locations.length;i++)
        {
            if(c1.equals(locations[i])==true)
                l1=i;
            if(c2.equals(locations[i])==true)
                l2=i;
        }
        //verificam daca se poate ajunge de la locatia1 la locatia2 folosind BFS
        if(G.isReachable(l1, l2))
        {
            System.out.println("Am gasit un drum de la "+c1.getName()+" la "+c2.getName());
        }
        else{
            System.out.println("Nu exista drum");
        }
    }
}
