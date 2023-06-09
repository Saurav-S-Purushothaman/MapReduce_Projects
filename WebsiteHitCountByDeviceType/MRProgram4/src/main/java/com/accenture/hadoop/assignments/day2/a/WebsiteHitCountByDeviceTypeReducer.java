package com.accenture.hadoop.assignments.day2.a;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class WebsiteHitCountByDeviceTypeReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	protected void reduce(Text key, Iterable<IntWritable> value, Context context)throws IOException, InterruptedException {
		
		int count = 0;
		for (IntWritable val: value) {
			count++;
		}
		
		context.write(key, new IntWritable(count));
	}
}
