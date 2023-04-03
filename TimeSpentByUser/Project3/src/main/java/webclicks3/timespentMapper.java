package webclicks3;

import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class timespentMapper extends Mapper<LongWritable, Text,Text, IntWritable> {
	protected void map(LongWritable key, Text value, Context context) throws IOException , InterruptedException{
		String[] data = value.toString().split("\t");
		String users = data[4];
		int timespent = new Integer(data[6]);
		
		
		context.write(new Text(users),new IntWritable(timespent));

		
		
	}
}
