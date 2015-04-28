package netty.sample;

import static org.jboss.netty.channel.Channels.pipeline;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;

public class HttpServerPipelineFactory implements ChannelPipelineFactory { 
    public ChannelPipeline getPipeline() throws Exception { 
        ChannelPipeline pipeline = pipeline(); 
        pipeline.addLast("handler", new HttpRequestHandler()); 
        return pipeline; 
    } 
}
