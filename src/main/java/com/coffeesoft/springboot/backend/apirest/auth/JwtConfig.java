package com.coffeesoft.springboot.backend.apirest.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpQIBAAKCAQEAv4iXtaKAKrYVVwo831bJk0sfaM5UCrIphRzu9WVV+vuy6/is\n" +
            "XD1HBq8LaxSBjkIoH/y+a+hvE33+0A1zWKR3VvmgbfHcP01F31bUKjUxbvEbOqvT\n" +
            "rzykMR+0j0FpjwpbrQXGUGsWEqL+DxrAAL8La8AorVJ3R76tQkrQ4Q4tMOCfI+dl\n" +
            "SDz22U2sXriJs4WaBwjcwWiCZ6Y+Wu4nb0N37NtNOmwV+9VDye3MzShChsJUV9Ii\n" +
            "VmqQAx/4N07dMom1jP3YoPJWExiJLbCoCAhpsh8OKcWUUnCSR17r6rt1Ln/4hDUY\n" +
            "9QmU21MZR+gsnbQxSej5dazTfma1ELlYtVfLuwIDAQABAoIBAQCQ2iDCQW9k3egt\n" +
            "t5Rp5Bz2xG2wubpdjHhSL5uZA1aPRiP+ykawS7eXmnKsPQnuKKJn7qGkwlifCT7Y\n" +
            "4hNGCrwmjwuBmtTTGwGo8uXqNeh42ueY67JgaSBT9oJ7hSDsCQ1kQWXGE/bRiWtS\n" +
            "yQxEhDeC+gTJcAC9xbsK08I9MpeCykwZAep7wnuEPCrHJgdSo3DPGbL3p3rdhcex\n" +
            "oAAav7rjqV8rnk3wuqEI7UwORz1Q7BKZlF+Ps1f6r4QAT+i17Qkwmrxbiulzbvnw\n" +
            "cIGlhj9YtnWDDXECRLq+BKQi+cEC89Umz8X5K2svSvqe+ei/6yJoCbW7g9FnF5cy\n" +
            "faVamgDBAoGBAP1PsNutA+Og8Q0I29T+OFc9nONJHDimYJ1zAhC9oaCoQj1EpZ7Q\n" +
            "yT2sOk2ieH02fqYV4BWQNJ5zH+vRNpSLBjkUCgJx55dOyA/v1LTlMBIQ6UBEM97q\n" +
            "6aPOl1o54c7Iey3lBHC+dIrpoMNx6r0K5Ip85aMXQ7N8gFpQoZT7oqBDAoGBAMGR\n" +
            "CVXygdK/Fpw4IMSyGxnTQ4LfpetlFUG/kxNlC7yEJa5wYrsajqYhmAjJRxEyjEMl\n" +
            "lZxHgfQ3mRXCPVfEoqq+JMvXh4G5gcL7EqrwZL6FzjPopydOKwepugaL8P78USag\n" +
            "5mvMTJTzyvPLGW6H8cpxoe+udfNDXeHgsLEb/cspAoGBAJEFXqtlkiRvr5FW0QRP\n" +
            "xtGrZHZ7FL0aA5Ygkb4j0rS3n7ST6H3T6mJ0h6yKp5CH8loDjBbMSFOudUf8rtK8\n" +
            "BQQIhPKBY6UsZT06gPxPegXdyKwSX9/vfXNagywUl0JbZKoRw0kIwJAG0RMT1OAF\n" +
            "rHHcr1t/pjLLxG/wWZGBvskhAoGBAL3o+ZrcmijVmG5e1y+EevhkgUkm+hewjiF6\n" +
            "vub5bYFgucOiugtObARs00hTiilCScEbX+T7d3HPFp/1ec/huaMBeQKRjH5nLfvJ\n" +
            "76/MuVr/1qaxLUZv9+HF0SDZLfJORaQ7mrbKs5w0cLuuWV5LfJudzz5kEY9BWhvi\n" +
            "IhkyGFe5AoGAGOpKfaXMf+1KW12LCfXshmuCLphmBHD4B68zBnSi+FCHk0rmwHTO\n" +
            "9gKiS5rxCKp9d6TZvPyxSkK7uONkkW0VDIteXQwyfFY8PrwXzvstiQnVIqY7q55b\n" +
            "mfl741A9VVpXTfSHuwv8fMPK7nu1qqJl0rqdXYCbl0e7hLJTsLsuS7M=\n" +
            "-----END RSA PRIVATE KEY-----";
    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv4iXtaKAKrYVVwo831bJ\n" +
            "k0sfaM5UCrIphRzu9WVV+vuy6/isXD1HBq8LaxSBjkIoH/y+a+hvE33+0A1zWKR3\n" +
            "VvmgbfHcP01F31bUKjUxbvEbOqvTrzykMR+0j0FpjwpbrQXGUGsWEqL+DxrAAL8L\n" +
            "a8AorVJ3R76tQkrQ4Q4tMOCfI+dlSDz22U2sXriJs4WaBwjcwWiCZ6Y+Wu4nb0N3\n" +
            "7NtNOmwV+9VDye3MzShChsJUV9IiVmqQAx/4N07dMom1jP3YoPJWExiJLbCoCAhp\n" +
            "sh8OKcWUUnCSR17r6rt1Ln/4hDUY9QmU21MZR+gsnbQxSej5dazTfma1ELlYtVfL\n" +
            "uwIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
