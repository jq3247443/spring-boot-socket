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
package vip.jiaqiang.socket.stomp;

import java.security.Principal;

public class UserPrincipal implements Principal, java.io.Serializable {

    private String name;

    public UserPrincipal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
