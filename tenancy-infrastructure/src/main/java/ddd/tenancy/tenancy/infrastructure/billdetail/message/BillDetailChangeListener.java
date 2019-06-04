package ddd.tenancy.tenancy.infrastructure.billdetail.message;

import ddd.base.domain.EventListenerI;
import ddd.tenancy.tenancy.domain.common.billdetail.event.BillDetailChangeEvent;
import org.springframework.stereotype.Component;

/**
 * BillDetailChangeListener
 * date Jun 4, 2019 12:44:25 PM
 */
@Component
public class BillDetailChangeListener implements EventListenerI<BillDetailChangeEvent> {

  @Override
  public void execute(BillDetailChangeEvent event) {

  }

}
