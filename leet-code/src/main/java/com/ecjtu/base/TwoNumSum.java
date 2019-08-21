package com.ecjtu.base;

import com.ecjtu.jdbc.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiexiang
 * @date 2019/8/13 7:49 PM
 */

public class TwoNumSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from game_interflow_conf where relation_id=?");
        statement.setInt(1,62);
        ResultSet result= statement.executeQuery();

    }
}
