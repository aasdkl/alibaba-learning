package loadbalance;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

public class MyRandomRule extends AbstractLoadBalancerRule {
    @Override
    public Server choose(Object o) {
        List<Server> servers = this.getLoadBalancer().getReachableServers();
        int i = ThreadLocalRandom.current().nextInt(servers.size());
        Server server = servers.get(i);
        return server.isAlive() ? server : null;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }
}
