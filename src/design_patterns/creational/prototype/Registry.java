package design_patterns.creational.prototype;

import java.util.HashMap;

public class Registry {
    private static HashMap<String, Certificate> certificates = new HashMap<String, Certificate>();
    public static Certificate getCertificate(String type){
        Certificate certificate = certificates.get(type.toLowerCase());
        if(certificate == null){
            switch(type.toLowerCase()){
                case "death":
                    certificate = new DeathCertificate(null, null, null, null);
                    break;
                case "birth":
                    certificate = new BirthCertificate(null, null, null, null);
                    break;
            }
            certificates.put(type.toLowerCase(), certificate);
        }
        return (Certificate)certificate.clone();
    }
}
