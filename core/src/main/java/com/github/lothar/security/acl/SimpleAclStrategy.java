package com.github.lothar.security.acl;

import java.util.HashMap;
import java.util.Map;

public class SimpleAclStrategy implements AclStrategy {

  private Map<AclFeatureType, Object> features = new HashMap<>();

  public <Feature> void register(AclFeatureType featureType, Feature feature) {
    features.put(featureType, feature);
  }

  @SuppressWarnings("unchecked")
  public <Feature> Feature featureFor(AclFeatureType featureType) {
    return (Feature) features.get(featureType);
  }

}
