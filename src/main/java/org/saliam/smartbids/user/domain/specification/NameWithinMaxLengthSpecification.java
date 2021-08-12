package org.saliam.smartbids.user.domain.specification;

import org.saliam.smartbids.commons.validation.Specification;
import org.saliam.smartbids.user.domain.entity.User;

import java.util.Objects;

public class NameWithinMaxLengthSpecification implements Specification<User>
{
  @Override
  public boolean IsSatisfiedBy(User subject)
  {
    return Objects.nonNull(subject.getId()) && !subject.getUsername().isEmpty() && subject.getUsername().length() < 50;
  }
}
