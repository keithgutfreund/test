import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class ESClient {

  void test() {
		Client client = new TransportClient()
        .addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
		
		// This does a match_all
		// MatchAll on the whole cluster with all default options
		SearchResponse response = client.prepareSearch().execute().actionGet();
		System.out.println(response);
	}
	
	public static void main(String[] args) {
		ESClient e = new ESClient();
		e.test();
	}
	
}
