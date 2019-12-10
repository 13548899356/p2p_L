package com.zking.ssm.shiro;


import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 用于shiro权限认证的密码工具类
 */
public class PasswordHelper {

    /**
     * 随机数生成器
     */
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    /**
     * 指定hash算法为MD5
     */
    private static final String hashAlgorithmName = "md5";

    /**
     * 指定散列次数为1024次，即加密1024次
     */
    private static final int hashIterations = 1024;

    /**
     * true指定Hash散列值使用Hex加密存. false表明hash散列值用用Base64-encoded存储
     */
    private static final boolean storedCredentialsHexEncoded = true;

    /**
     * 获得加密用的盐
     *
     * @return
     */
    public static String createSalt() {
        return randomNumberGenerator.nextBytes().toHex();
    }

    /**
     * 获得加密后的凭证
     *
     * @param credentials 凭证(即密码)
     * @param salt        盐
     * @return
     */
    public static String createCredentials(String credentials, String salt) {
        SimpleHash simpleHash = new SimpleHash(hashAlgorithmName, credentials,
                salt, hashIterations);
        return storedCredentialsHexEncoded ? simpleHash.toHex() : simpleHash.toBase64();
    }


    /**
     * 进行密码验证
     *
     * @param credentials        未加密的密码
     * @param salt               盐
     * @param encryptCredentials 加密后的密码
     * @return
     */
    public static boolean checkCredentials(String credentials, String salt, String encryptCredentials) {
        return encryptCredentials.equals(createCredentials(credentials, salt));
    }

    public static void main(String[] args) {
        //盐
        String salt = createSalt();
        System.out.println("盐"+salt);
        System.out.println("盐的长度"+salt.length());
        //凭证+盐加密后得到的密码
        String credentials = createCredentials("123456", salt);
        System.out.println(credentials);
        System.out.println(credentials.length());
        salt="ca040fda4b35681b85b646412bb8c0fb";
        credentials="57695c2f6fd94baaaef8d21e5b9dff93";
        boolean b = checkCredentials("123456", salt, credentials);
        System.out.println(b);
//        盐：d959ec8709331d8e9386a786bba6f2bb   密文密码：2f3dc059be4a69016c2014f13d3d9d8c
        //        盐：b5c5d4e63a384e956c26068a42912496   密文密码：a7083ce6bbfb52414fa657ad57a23aea



    }
}
