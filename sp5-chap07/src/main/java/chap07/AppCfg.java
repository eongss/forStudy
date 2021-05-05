package chap07;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="chap07")
public class AppCfg {
	
	@Bean
//	@Qualifier("impeCal")
	public ImpeCalculator impeCal() {
		ImpeCalculator impeCalculator = new ImpeCalculator();
		return impeCalculator;
	}
	
	@Bean
	public RecCalculator recCal() {
		RecCalculator recCalculator = new RecCalculator();
		return recCalculator;
	}
	
}
