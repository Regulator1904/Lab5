package AgentDemo;
import PoolPattern.ObjectPool;

public class FBIAgentApp {
  public static void main(String[] args){
    ObjectPool server = ObjectPool.getPoolInstance(new FBI_Agent_Creator(), 5);
    for(int i=0;i<10;i++){
      Thread client= new Thread(new TaskRequester(server));
      client.start();
      //System.out.println("in FBIAgentApp > for loop position: "+i);
    }
  }
}
