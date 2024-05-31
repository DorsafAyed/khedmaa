package com.example.demo;

import org.keycloak.representations.idm.RealmRepresentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.keycloak.admin.client.Keycloak;
import java.util.Map;

@RestController
public class RealmController {
 //   private static final Logger logger = LoggerFactory.getLogger(RealmController.class);
    @Autowired
    private Keycloak k;

    @PostMapping("/api/create-realm")
    public void createRealm(@RequestBody Map<String, String> payload) {
        String realmName = payload.get("realmName");
        RealmRepresentation realm = new RealmRepresentation();
        realm.setRealm(realmName);
        realm.setEnabled(true);
        k.realms().create(realm);
    }
}
