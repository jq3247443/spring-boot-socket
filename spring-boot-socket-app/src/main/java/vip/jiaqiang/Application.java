/**
 * _.._        ,------------.
 * ,'      `.    ( 大哥进来玩啊 )
 * /  __) __ ` \    `-,----------'
 * (  (`-`(-')  ) _.-'
 * /)  \  = /  (
 * /'    |--' .  \
 * (  ,---|  `-.)__`
 * )(  `-.,--'   _`-.
 * '/,'          (  草",
 * (_       ,    `/,-' )
 * `.__,  : `-'/  /`--'
 * |     `--'  |
 * `   `-._   /
 * \        (
 * /\ .      \.  又偷代码
 * / |` \     ,-\
 * /  \| .)   /   \
 * ( ,'|\    ,'     :
 * | \,`.`--"/       }  fuck your mother
 * `,'    \  |,'     /
 * / "-._   `-/       |
 * "-.  "-.,' |       ;
 * /      _/   ["---'"]
 * :       /    |"-    '
 * '            |     /
 * `     |
 */
package vip.jiaqiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import vip.jiaqiang.socket.stomp.WebSocketConfig;

@SpringBootApplication
@Import( {WebSocketConfig.class} )
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
