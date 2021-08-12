package org.saliam.smartbids.user.domain.specification;

import org.saliam.smartbids.commons.validation.Specification;
import org.saliam.smartbids.user.domain.entity.User;

import java.util.Objects;

public class IdNotEmptySpecification implements Specification<User>
{
  @Override
  public boolean IsSatisfiedBy(User subject)
  {
    return Objects.nonNull(subject.getId());
  }
}
