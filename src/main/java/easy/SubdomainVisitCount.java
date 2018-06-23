package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> domainsMap = new HashMap<>();
        for (String cpdomain: cpdomains) {

            String[] splitCpdomain = cpdomain.split(" ");
            Integer visitsAmount = Integer.valueOf(splitCpdomain[0]);
            String subdomain1 = splitCpdomain[1];
            String subdomain2 = subdomain1.substring(subdomain1.indexOf('.') + 1);

            domainsMap.put(subdomain1, domainsMap.getOrDefault(subdomain1, 0) + visitsAmount);
            domainsMap.put(subdomain2, domainsMap.getOrDefault(subdomain2, 0) + visitsAmount);

            int index = subdomain2.indexOf('.');
            if (index != -1) {
                String subdomain3 = subdomain2.substring(index + 1);
                domainsMap.put(subdomain3, domainsMap.getOrDefault(subdomain3, 0) + visitsAmount);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry entry: domainsMap.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }
}
